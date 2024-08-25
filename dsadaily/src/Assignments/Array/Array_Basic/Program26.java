
//      Positive and Negative Elements

package Assignments.Array.Array_Basic;

public class Program26 {

    static void positiveAndNegative( int arr[], int N){
        
        int newarr[] = new int[N];

        int n = 0;

        int m = 1;

        for( int i = 0; i < N; i++){

            if( arr[i] > 0){
                newarr[n] = arr[i];
                n = n+2;
            }else{
                newarr[m] = arr[i];
                m = m+2;
            }
        }
        for( int i = 0 ; i < N; i++){

            System.out.println(newarr[i]);
        }
    }

    public static void main(String[] args) {
        
        int N = 6;

        int arr[] = { -1, 2, -3, 4, -5, 6};

        positiveAndNegative(arr, N);


    }
    
}
