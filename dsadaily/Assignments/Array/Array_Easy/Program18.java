
//      Move all zero to the end of array

package Assignments.Array.Array_Easy;

public class Program18 {

    static void pushZeroToEnd( int arr[],  int N){

        int count = 0;

        for( int i = 0; i < N; i++ ){

            if( arr[i] != 0 )
                arr[count++] = arr[i];

        }

        while( count < N)
            arr[count++] = 0;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 5, 0, 0, 4};

        int N = arr.length;

        pushZeroToEnd(arr, N );
        
        for( int i = 0; i < N; i++ )
            System.out.print(arr[i] + " ");
    }
    
}
