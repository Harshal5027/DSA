package Assignments.Array.ArrayMedium;

public class Program3 {

    int zeroSumSubArray( int arr[], int N){

        int count = 0;

        for( int i = 0; i < arr.length; i++){

            int sum = 0;

            for( int j = i; j < arr.length; j++){

                sum += arr[j];

                if( sum == 0){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        int n = 10;

        int arr[] = {6, -1, -3, 4, -2, 2, 4, 6, -12, -7};

        Program3 obj = new Program3();

        System.out.println(obj.zeroSumSubArray(arr, n));
    }
    
}