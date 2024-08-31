
//      First Repeating Number...........................

package Assignments.Array.Array_Easy;

public class Program10 {

    static int firstReprating( int arr[], int N){

        for( int i = 0; i < N; i++){

            for( int j = i+1; j < N; j++){

                if( arr[i] == arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {1, 5, 3, 4, 3, 5, 6};

        System.out.println(firstReprating( arr, arr.length ));
    }
    
}
