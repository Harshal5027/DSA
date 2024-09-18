
//      Alternative Positive And Negative Number

package Assignments.Array.Array_Easy;

public class Program30 {

    static void alternativesPositiveNegative( int arr[], int N, int alternative[] ){

        int positiveCount = 0;

        int negativeCount = 1;

        for( int i = 0; i < N; i++ ){

            if( arr[i] < 0 ){

                alternative[negativeCount] = arr[i];
                negativeCount += 2;
                 
            }else{

                alternative[positiveCount] = arr[i];
                positiveCount += 2;
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = { 9, 4, -2, -1, 5, 0, -5, -3, 2};

        int N = arr.length;

        int alternative[] = new int[N];

        alternativesPositiveNegative( arr, N, alternative );

        for( int i = 0; i < N; i++ ){

            System.out.print(alternative[i]+" ");
        }
    }
    
}