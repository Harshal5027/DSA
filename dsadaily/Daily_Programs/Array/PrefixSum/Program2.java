
//  Prefix sum without exctra array

package Daily_Programs.PrefixSum;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        
        int arr[] = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

        int N = arr.length;

        int Q =3;

        for( int i = 1; i < N; i++){

            arr[i] = arr[i-1] + arr[i];

        }

        Scanner sc = new Scanner(System.in);
        for( int i = 0; i < Q; i++){

            System.out.println("Enter Start Index");
            int startIndex = sc.nextInt();

            System.out.println("Enter a End Index");
            int endIndex = sc.nextInt();

            if( startIndex == 0){
                System.out.println(arr[endIndex]);
            }else{
                System.out.println(arr[endIndex] - arr[startIndex-1]);
            }
        }

        sc.close();
        
    }
    
}
