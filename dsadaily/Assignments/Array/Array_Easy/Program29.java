
//      Key Elements

package Assignments.Array.Array_Easy;

public class Program29 {

    static boolean keyElements( int arr[], int N, int X ){

        int count = 0;

        for( int i = 0; i < N; i++ ){

            for( int j = 0; j < N; j++ ){

                if( i == j)
                    continue;

                if( arr[i] + arr[j] == X ){
                    count++;
                    break;
                }
            }
            if( count > 0 ){

                return true;
                
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        int arr[] ={ 1, 4, 45, 6, 10, 8};

        int N = arr.length;

        int X = 16;

        System.out.println(keyElements( arr, N, X ));
    }
    
}