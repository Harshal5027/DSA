
//      Multiply left and right subarray sum

package Assignments.Array.Array_Basic;

public class Program33 {

    static int multiplySubArray( int arr[], int N ){

        int leftSubArraySum = 0;

        int rightSubArraySum = 0;

        for( int i = 0; i < N; i++){

            if( i < N/2 ){

                leftSubArraySum = leftSubArraySum + arr[i];
            }else {

                rightSubArraySum = rightSubArraySum + arr[i];
            }
        }

        return leftSubArraySum*rightSubArraySum;
    }

    public static void main(String[] args) {
        
        int arr[] = { 1, 2};

        int N = 2;

        System.out.println(multiplySubArray( arr, N ));
    }
    
}