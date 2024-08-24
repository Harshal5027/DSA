
//   Find the Sum of the Distinct Elements in the Array---------------------

package Assignments.Array.Array_Basic;

import java.util.*;

public class Program15 {

    static int distinctSum( int arr[], int N){

        int sum = 0;

        // int dictinctArr[] = new int[N];

        for( int i = 0; i < N; i++){

            int count = 0;

            for( int j = 0; j <= i; j++ ){              

                if(arr[i] == arr[j]){

                    count++;
                }
            }
            if(count==1){
                sum = sum + arr[i];
            }
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of an Array ");

        int N = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter a elements in the Array ");

        for( int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Sum of the Distinct elements are : "+distinctSum( arr , N ));
        
    }
    
}