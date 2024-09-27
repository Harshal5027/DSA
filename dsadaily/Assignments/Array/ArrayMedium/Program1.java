
/*1] Maximum Index
Given an array arr[] of n non-negative integers. The task is to find the maximum of J-1 (i<=j) subjected 
to the constraint of arr[i] <= arr[j].

Example 1:

Input:
n=9
arr = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output : 6

Explanation:
In the given array arr[1]<arr[7] satisfying the required condition (arr[i] <= arr[j]) thus giving the
 maximum difference of ji which is 6(7-1). */

package Assignments.Array.ArrayMedium;

public class Program1 {

    static int maximumIndex( int arr[], int N){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int i = -1;
        int j = -1;

        for( int k = 0; k < N; k++ ){

            if( arr[k] > max && k >= i ){
                max = arr[k];
                j = k;
            }
            if( arr[k] < min && k <= j){
                min = arr[k];
                i = k;

                max = arr[k];
                j = k;
            }
        }
        System.out.println(min+" "+max);

        return (j - i);
    }

    public static void main(String[] args) {
        
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};

        int n = arr.length;

        System.out.println(maximumIndex(arr, n));
    }
    
}