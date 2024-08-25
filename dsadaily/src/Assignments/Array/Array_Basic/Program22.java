
//      Exceptionally Odd

package Assignments.Array.Array_Basic;

public class Program22 {

    static void exceptionallyOdd( int arr[] ){

        for( int i = 0; i < arr.length; i++){

            int count = 0;

            for( int j = 0; j < arr.length; j++){

                if( arr[i] == arr[j]){

                    count++;
                    
                }
            }

            if( count % 2 != 0 ){

                System.out.println(arr[i]+" occurs "+count+" times ");

                break;
            }
        }

    }

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 2, 3, 1, 3};

        exceptionallyOdd( arr );
    }
    
}