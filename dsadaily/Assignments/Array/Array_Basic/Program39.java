
//      Leaders in an Array

package Assignments.Array.Array_Basic;

public class Program39 {

    static void leadersArray( int arr[], int N){

        int Leader = Integer.MIN_VALUE;

        for( int i = N-1; i >= 0; i--){

            if( arr[i] > Leader){
                Leader = arr[i];

                System.out.println(Leader);
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {16, 17, 4, 3, 5, 2};

        int N = arr.length;

        leadersArray( arr, N);

    }
}