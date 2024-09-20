
//      Rotation 

package Assignments.Array.Array_Easy;

public class Program16 {

    static int rotation( int arr[], int N ){

        int max = Integer.MIN_VALUE;

        int count = 0;

        for( int i = 0; i < N; i++ ){

            if( arr[i] > max )
                max = arr[i];
        }

        for( int i = 0 ; i < N; i++ ){

            if( arr[i] == max )
                count = i;
        }

        if( count == N-1 )
            return 0;
        else
            return count+1;
    }

    public static void main(String[] args) {
        
        int arr[] = { 5, 1, 2, 3, 4 };

        int N = arr.length;

        System.out.println(rotation( arr, N ));
    }   
}
