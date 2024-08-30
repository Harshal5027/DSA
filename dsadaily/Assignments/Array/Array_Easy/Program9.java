
//      Transition Point

package Assignments.Array.Array_Easy;

public class Program9 {

    static int transitionPoint( int arr[], int N){

        for( int i = 0; i < N; i++){

            if( arr[i] == 1){

                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = { 0, 0, 0, 0, 0, 0};

        int N = arr.length;

        System.out.println(transitionPoint( arr, N));
    }
    
}
