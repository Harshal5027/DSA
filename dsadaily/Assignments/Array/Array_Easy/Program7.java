
//      Check array is sorted in non decreasing order or not

package Assignments.Array.Array_Easy;

public class Program7 {

    static void sortedOrNot( int arr[], int N){

        for( int i = 0; i < N-1 ; i++){

            if( arr[i] > arr[i+1]){

                System.out.println( "Given array is not Sorted ");

                return ;

            }
        }

        System.out.println(" Given array is sorted ");
    }
    public static void main(String[] args) {
        
        int arr[] = { 10, 20, 30, 40, 50};

        sortedOrNot( arr, arr.length);
    }
    
}
