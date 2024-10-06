/* 
 * Count of element 
 * Problem Description
 * Given An array A of N integer 
 * Count the number of elements that have at least 1 element greater the itself
 * 
 * problem Constraints
 * 1<= N <= 10'5
 * 1<= A[i] <= 10,9
 * 
 * Example Input 
 * Input 1 :
 * A : [3, 1, 2]
 * Output = 2
 * 
 * Input 2 : 
 * A : [5, 5, 3]
 * Output = 1
 */

package Daily_Programs.Array.PrefixSum;

public class Program3 {

    public static void main(String[] args) {
        
        int arr[] = {3, 1, 2};

        int N = arr.length;

        int count = 0;

        int max = Integer.MIN_VALUE;

        for( int i =0 ; i < N; i++){

            if( max < arr[i]) {

                max = arr[i];

                count = 0;
            }

            if( max == arr[i] ){
                count++;
            }
        }

        System.out.println(N-count);
    }
    
}
