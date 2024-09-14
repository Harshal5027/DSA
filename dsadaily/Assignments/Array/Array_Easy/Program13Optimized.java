package Assignments.Array.Array_Easy;

public class Program13Optimized {

    static int minimumDistance( int arr[], int N, int x, int y){

        int xIndex = -1;

        int yIndex = -1;

        int finalDistance = Integer.MAX_VALUE;

        for( int i = 0; i < N; i++){

            if( arr[i] == x){

                xIndex = i;
            }
            if( arr[i] == y){

                yIndex = i;
            }

            if( xIndex != -1 && yIndex != -1){

                finalDistance = Math.min(Math.abs(xIndex - yIndex), finalDistance);
            }
        }

        if( xIndex == -1 || yIndex == -1){

            return -1;
        }else {

            return finalDistance;
        }
    }

    public static void main(String[] args) {
        
        int arr[] = { 1, 2, 3, 2};

        int N = arr.length;

        int x = 1, y = 2;

        System.out.println(minimumDistance( arr, N, x, y));
    }
    
}
