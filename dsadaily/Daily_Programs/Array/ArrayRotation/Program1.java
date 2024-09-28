/*
 * Array Rotation 
 * Given an integer array A of size N and an integer B, you have to return the same array after rotating 
 * B times towards the right
 * 
 * Problem Constraints 
 * 1 <= N <= 10^5
 * 1<= A[i] <= 10^9
 * 1 <= B <= 10^9
 * 
 * Input1 :
 * A = [1, 2, 3, 4]
 * B = 2                        Output : [3, 4, 12]
 * 
 * Input2 :
 * A = [2, 5, 6]
 * B = 1                        Output : [6, 2, 5]
 */



public class Program1 {

    static void arrayRotate( int arr[], int N, int B){

        //New array for Storing rotated elements
        int newArr[] = new int[N];

        int k = 0;

        //Storing elements from B
        for( int i = B; i < N; i++){

            newArr[i] = arr[k];
            k++;
        }

        //Storing element upto B
        for( int i = 0; i < B; i++){

            newArr[i] = arr[k];
            k++;
        }

        for( int i = 0; i < N; i++ ){

            arr[i] = newArr[i];
        }


    }

    public static void main(String[] args) {
        
        int arr[] = new int[] {1, 2, 3, 4};

        int B = 2;

        int N = arr.length;

        arrayRotate(arr, N, B);

        for( int i = 0; i < N; i++){
            System.out.print(arr[i]+" ");

        }
    }
    
}
