
//      Finding Duplicates in the array

package Assignments.Array.Array_Easy;

public class Program3 {

    static void duplicatesInArray( int arr[], int N){

        // int count = 0;
        int noDuplicate = -1;


        for( int i = 0; i < N; i++){
            
            int count = 0;

            for( int j = 0; j <= i; j++){

                if( arr[i] == arr[j]){

                    count++;
                }
                
            }
            if( count == 2){
                System.out.println(arr[i]);
                noDuplicate++;
            }
        }

        if( noDuplicate == -1){

            System.out.println(noDuplicate);

        }
    }

    public static void main(String[] args) {
        
        int arr[] = {0, 3, 1, 2};

        duplicatesInArray( arr, arr.length );
    }
    
}
