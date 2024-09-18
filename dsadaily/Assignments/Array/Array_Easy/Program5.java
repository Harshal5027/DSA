
//      Peak Element

package Assignments.Array.Array_Easy;

public class Program5 {

    static int peakElement( int arr[], int N ){

        for( int i = 0; i < N ; i++ ){

            if( i == 0 ){

                if( arr[i+1] < arr[i] )
                    return 1;

                continue;
            }
            if( i == N-1 ){

                if( arr[i-1] < arr[i])
                    return 1;
            }
            if( arr[i-1] < arr[i] && arr[i+1] < arr[i] )
                return 1;
                
        }

        return 0;
    }
    
    public static void main(String[] args) {
        
        int arr[] = { 1, 2, 3};

        int N = arr.length;

        System.out.println(peakElement( arr, N));
    }
}
