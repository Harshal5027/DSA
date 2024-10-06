/* Given an Array of size N and Q Number of Queries 
 * Query contain two parameter ( S,  E)
 * S - Start index 
 * E - End Index 
 * For the all the Queries, print the sum of all elements from start index to end index.
 * 
 * Arr : [-3, 6, 2, 4, 5, 2, 8, -9, 3, 1]
 * N : 10
 * Q : 3
 * Queries      S       E       Sum
 * Query1       1       3       12
 * Query2       2       7       12
 * Query3       1       1       6
 */
package Daily_Programs.Array.PrefixSum;

import java.util.*;
public class Program1 {

    static void prefixSum( int arr[], int N , int Q){

        int newArr[] = new int[N];

        newArr[0] = arr[0];

        for( int i = 1; i < N; i++){

            newArr[i] = newArr[i-1] + arr[i];

        }
        Scanner sc = new Scanner(System.in);

        int sum;

        for( int i = 0; i < Q; i++ ){
            System.out.println("Enter Starting Index");
            int S = sc.nextInt();

            System.out.println("Enter End Index");
            int E = sc.nextInt();

            if( S == 0)
                sum = newArr[E];

            else
                sum = newArr[E] - newArr[S-1];

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        
         int arr[] = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

         int N = arr.length;

         int Q = 3;

         prefixSum(arr, N, Q);
    }
    
}