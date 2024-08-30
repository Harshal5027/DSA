
//      Rotate Array

package Assignments.Array.Array_Easy;

public class Program8 {

    static void rotateArr( int arr[], int rotateArr[], int N, int D ){

        for( int i = 0; i < N; i++){

            int index = ((N+i)-D )% N;

            rotateArr[index] = arr[i];
        }
    }

    public static void main(String[] args) {
        
        int arr[] = { 1, 2, 3, 4, 5};

        int rotateArr[] = new int[arr.length];

        int D = 2;

        rotateArr( arr, rotateArr, arr.length, D );

        for( int i = 0; i < arr.length; i++){

            System.out.println(rotateArr[i]);
        }
    }
    
}
