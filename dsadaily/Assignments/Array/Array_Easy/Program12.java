
//      Number of Occurance

package Assignments.Array.Array_Easy;

public class Program12 {

    static int numberOfOccurance( int arr[], int N, int X){

        // int start = 0;

        // int end = N - 1;
        
        // int count = 0;

        // while( start <= end){

        //     int mid = (start + end)/2;

        //     if( arr[mid] == X){

        //         count++;
        //         // start++;
        //     }else if( arr[mid] > X){

        //         end = mid-1;
        //     }else {
        //         start = mid + 1;
        //     }
        // }
        
        // return count;

        int count = 0;

        for( int i = 0; i < N; i++){

            if( arr[i] == X){
                count++;
            }else if (arr[i] > X) {
                return count;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        
        int arr[] = { 1, 1, 2, 2, 2, 2, 3};

        int X = 2;

        System.out.println(numberOfOccurance( arr, arr.length, X));
    }
}
