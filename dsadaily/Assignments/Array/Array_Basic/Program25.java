
//      Maximum product of the two numbers ( in array elements is greater than equal to the zero)

package Assignments.Array.Array_Basic;

public class Program25 {

    static int maximumProduct( int arr[], int N){

        // int product = 1;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for( int i = 0; i < N; i++){

            if( arr[i] >= max ){

                secondMax = max;

                max = arr[i];
            }else if( arr[i] > secondMax && arr[i] != max){

                secondMax = arr[i];
            }
        }
        return max * secondMax;
    }

    public static void main(String[] args) {

        int N = 6;

        int arr[] = { 1, 4, 3, 6, 7, 0};

        System.out.println(maximumProduct( arr, N));
    }
    
}
