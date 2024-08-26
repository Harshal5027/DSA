
//      Immediate Smaller Elmements

package Assignments.Array.Array_Basic;

public class Program38 {

    static void immediateSmaller( int arr[], int N){

        for( int i = 0; i < N; i++){

            if( i == N-1){
                arr[i] = -1;
                break;
            }
            if( arr[i] > arr[i+1]){
                arr[i] = arr[i+1];
            }else{
                arr[i] = -1;
            }

            // System.out.println(arr[i]);
        }

        for( int i = 0; i < N; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {4, 2, 1, 5, 3};

        immediateSmaller( arr, arr.length);
    }
    
}