
//      Second Largest Element in the Array

package Assignments.Array.Array_Easy;

public class Program6 {

    static int secondLargest( int arr[], int N){

        int largest = Integer.MIN_VALUE;

        int secondLargest = Integer.MIN_VALUE;

        for( int i = 0; i < N; i++){

            if( arr[i] > largest ){

                secondLargest = largest;

                largest = arr[i];

            }else if( arr[i] > secondLargest && arr[i] != largest){

                secondLargest = arr[i];

            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        
        int arr[] = { 12, 35, 1, 10, 34, 11, 1};

        System.out.println(secondLargest( arr, arr.length));
    }
    
}
