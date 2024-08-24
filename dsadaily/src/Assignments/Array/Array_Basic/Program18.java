
//   Find Subarray with given Sum 

package Assignments.Array.Array_Basic;

public class Program18 {

    static void subarrayGivenSum( int sum, int arr[]){

        // int subArraySum = 0;

        int count = 0;

        for( int i = 0; i < arr.length; i++){

            int subArraySum = 0;


            for( int j = i; j < arr.length; j++ ){

                subArraySum = subArraySum + arr[j];

                if( sum == subArraySum ){
                    count++;
                    System.out.println("Sum Found between index "+i+" and "+j);
                }

            }
        }
        if( count==0 ){

            System.out.println("SubArray Not Found ");
        }
    }

    public static void main(String[] args) {
        
        int sum = 0;

        int arr[] = { 1, 4};

        subarrayGivenSum( sum, arr);
    }
}