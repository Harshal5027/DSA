
//      LeftMost and Rightmost index

package Assignments.Array.Array_Easy;

public class Program22 {

    static void leftmostRightmostIndex( int arr[], int N, int X){

        int leftMost = -1;

        int rightMost = -1;

        for( int i = 0; i < N; i++){

            if( arr[i] == X ){

                if( arr[i-1] != X)
                    leftMost = i;

                if(arr[i+1] != X)
                    rightMost = i;
            }
        }

        System.out.println(leftMost+"  &  "+rightMost);
    }

    public static void main(String[] args) {
        
        int arr [] = { 1, 3, 5, 5, 5, 5, 67, 123, 125};

        int N = arr.length;

        int X = 5;

        leftmostRightmostIndex( arr, N, X);
    }
    
}
