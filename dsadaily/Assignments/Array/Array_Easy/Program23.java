
//      Three Great Candidate

package Assignments.Array.Array_Easy;

public class Program23 {

    static void threeGreatCandidate( int arr[], int N){

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for( int i = 0; i < N; i++){

            if( arr[i] > first){

                third = second;

                second = first;

                first = arr[i];

            }
            if( arr[i] > second && arr[i] != first){

                third = second;
                second = arr[i];
            }

            if( arr[i] > third && arr[i] != first && arr[i] != second ){

                third = arr[i];
            }
        }

        System.out.println(first+", "+second+", "+third);

    }

    public static void main(String[] args) {
        
        int arr[] = { 10, 3, 5, 6, 20};

        int N = arr.length;

        threeGreatCandidate( arr, N);
    }
    
}
