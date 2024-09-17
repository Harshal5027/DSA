
//      Facing the sun

package Assignments.Array.Array_Easy;

public class Program24 {

    static int facingTheSun( int arr[], int N){

        int firstBuilding = arr[1];

        int count = 1;

        for( int i = 1; i < N; i++){

            if( arr[i] > firstBuilding )
                count++;

        }

        return count;
    }

    public static void main(String[] args) {
        
        int arr[] = { 7, 4, 8, 2, 9};

        int N = arr.length;

        System.out.println(facingTheSun( arr, N));
    }
    
}