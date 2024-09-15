package Assignments.Array.Array_Easy;

public class Program21 {

    static void nonRepeatingElement( int arr[], int N ){

        int count = 0;

        for( int i = 0; i < N; i++ ){

            int repeatCount = 0;

            for( int j = 0; j < N; j++ ){
                if( i == j)
                    continue;

                if( arr[i] == arr[j] ){

                    repeatCount++;
                }
            }

            if( repeatCount == 0 ){

                System.out.println(arr[i]);
                count++;
            }
        }
        if( count == 0){
            System.out.println(count);
        }
    }
    
    public static void main(String[] args) {
        
        int arr[] = { -1, 2, -1, 3, 2};

        int N = arr.length;

        nonRepeatingElement( arr, N);
    }
}