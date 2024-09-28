/*
 * Given integer array of size N
 * build an array leftmax of size N
 * leftmax of i contains the maximum for the index 0 to the index i 
 * 
 * Arr : [ -3, 6, 2, 4, 5, 2, 8, -2, 3, 1]
 * N = 10
 * leftMax : [ -3, 6, 6, 6, 6, 6, 8, 8, 8]
 * 
 */


package Daily_Programs.Array.CarrForward;

public class Program2 {
    public static void main(String[] args) {
        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int N = arr.length;
        
        int[] leftmax = new int[N];
       // int max=Integer.MIN_VALUE;
        leftmax[0] = arr[0];

        for(int i = 1; i < N; i++){

            if(arr[i] > leftmax[i-1]){
                leftmax[i] = arr[i];
            }else{
                leftmax[i] = leftmax[i-1];
            }
        }

        for( int i = 0; i < N; i++){

            System.out.print(leftmax[i]+" ");
        }
    }
}
