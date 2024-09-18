
//      Remove the Duplicate Elements from the sorted Array 

package Assignments.Array.Array_Easy;

public class Program27 {

    static int removeDuplicate( int arr[], int N ){

        if( arr.length == 0 )
            return 0;

        int uniqueElement = 0;

        for( int i = 1; i < arr.length; i++){

            if( arr[i] != arr[uniqueElement] ){

                uniqueElement++;

                arr[uniqueElement] = arr[i];
            }
        }

        return uniqueElement+1;
    }

    public static void main(String[] args) {
        
        int arr[] = { 2, 2, 2, 2, 2};

        int N = arr.length;

        int uniqueElementCount = removeDuplicate( arr, N );

        for( int i = 0; i < uniqueElementCount; i++ ){

            System.out.print(arr[i]+" ");
        }
    }
    
}
