
//      Move All negative numbers to the beginning and positive to end with a constant exctra space

package Assignments.Array.Array_Basic;

public class Program37 {

    static void moveElement( int arr[], int N ){

        for( int i = 0; i < N; i++){

            if(arr[i] > 0){

                for( int j = i; j < N-1; j++){
                
                    if(arr[j+1] < 0){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        for( int i = 0; i < N; i++){

            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6};

        moveElement( arr, arr.length );
    }
    
}
