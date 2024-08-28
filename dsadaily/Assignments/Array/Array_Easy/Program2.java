
//      Sort an array of 0s, 1s, and 2

package Assignments.Array.Array_Easy;

public class Program2 {

    static void sortArr( int arr[], int N){

        int c0 = 0, c1 = 0 ;

        for( int i = 0; i < N; i++){

            if( arr[i] == 0){
                c0++;
            }else if( arr[i] == 1){
                c1++;
            }
        }

        for( int i = 0; i < N; i++){

            if( i < c0 ){

                arr[i] = 0;

            }else if( i >= c0 && i < c0+c1){

                arr[i] = 1;

            }else{

                arr[i] = 2;
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = { 0, 2, 1, 2, 0, 1, 2, 0, 1, 1, 2, 1,0 ,0 , 1, 2, 0, 1, 2, 1, 0, 0, 0};

        sortArr( arr, arr.length);

        for( int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);

        }
    }
    
}
