
//      Count pair with given sum

package Assignments.Array.Array_Easy;

public class Program4 {

    static int countPairOfSum( int arr[] , int N, int K){

        int count = 0;

        for( int i = 0; i < N; i++){

            for( int j = i+1; j < N; j++){

                if( arr[i] + arr[j] == K ){
                    
                    count++;
                }
            }
        }
        if( count > 0){

            return count;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        
        int arr[] = { 1, 1, 1, 1};

        int K = 2;

        System.out.println(countPairOfSum( arr, arr.length, K ));
    }
    
}
