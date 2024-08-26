
//      Find the closest Number.......................

package Assignments.Array.Array_Basic;

public class Program30 {

    static int closestNumber( int K, int arr[]){

        int closestNumber = -1;
        int diff = Integer.MAX_VALUE;
        for( int i = 0; i < arr.length; i++){

            if( arr[i] < K){
                if( K - arr[i] < diff ){
                    closestNumber = arr[i];
                    diff = K - arr[i];
                }
            }else {

                if( arr[i] - K <= diff ){
                    closestNumber = arr[i];
                    diff = arr[i] - K;
                }

            }
        }

        return closestNumber;
    }

    public static void main(String[] args) {
        
        int K = 4;

        int arr[] = { 1, 2, 5, 3, 6, 8, 9};

        System.out.println(closestNumber( K, arr));
    }
    
}
