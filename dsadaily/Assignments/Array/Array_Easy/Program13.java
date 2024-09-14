
//      Minimum distance between two 

package Assignments.Array.Array_Easy;

public class Program13 {

    static int minimumDistance( int arr[], int N, int x, int y){

        if(x == y){

            return 0;

        }

        int finalDistance = Integer.MAX_VALUE;;

        for( int i = 0; i < N; i++ ){

            if( arr[i] == x || arr[i] == y){            

                for( int j = i; j < N; j++){

                    if( arr[i] == x && arr[j] == y){

                        if( finalDistance > Math.abs(i - j)){

                            finalDistance = Math.abs(i-j);

                        }

                    }else if( arr[i] == y && arr[j] == x){

                        if( finalDistance > Math.abs(i - j)){

                            finalDistance = Math.abs(i-j);

                        }
                    }
                }
            }

            if( finalDistance > N){

                return -1;
                
            }
        }


        return finalDistance;
    }
    
    public static void main(String[] args) {
        
        int arr[] = { 1, 2, 3, 2};

        int N = arr.length;

        int x = 1, y =2;

        System.out.println(minimumDistance( arr, N, x, y ));
    }
}
