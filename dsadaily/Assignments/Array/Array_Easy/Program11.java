
//      Frequencies of limited range Array Elements

package Assignments.Array.Array_Easy;

public class Program11 {

    static void frequencies( int arr[], int N){

        for( int i = 1; i <= N; i++){

            int count = 0;

            for( int j = 0; j < N; j++){

                if( i == arr[j]){

                    count++;

                }
            }

            System.out.println(count);
        }

    }

    public static void main(String[] args) {
        
        int arr[] = { 3, 3, 3, 3};

        frequencies( arr, arr.length);
    }
    
}
