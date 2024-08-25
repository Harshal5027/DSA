
//          Count pair Sum

package Assignments.Array.Array_Basic;

public class Program27 {

    static int countPairSum( int M, int N, int arr1[], int arr2[], int sum){

        int count = 0;

        for( int i = 0; i < M; i++){

            for( int j = 0; j < N; j++){

                if(arr1[i] + arr2[j] == sum){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int sum = 10;

        int M = 4; 
        int N = 4;

        int arr1[] = {1, 3, 5, 7};

        int arr2[] = {2, 3, 5, 8};

        System.out.println(countPairSum(M, N, arr1, arr2, sum));
    }
    
}
