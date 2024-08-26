
//      Count the numbers of elements between the given Num1 and Num2

package Assignments.Array.Array_Basic;

public class Program42 {

    static int countNumber( int arr[], int num1, int num2){

        int positionOfNum1 = Integer.MAX_VALUE;

        int positionOfNum2 = Integer.MIN_VALUE;

        for( int i = 0; i < arr.length; i++){

            if( num1 == arr[i] && positionOfNum1 > i){

                // System.out.println(i);

                positionOfNum1 = i;

            }
            if( num2 == arr[i] && positionOfNum2 < i){

                // System.out.println(i);

                positionOfNum2 = i;
            }
        }

        return positionOfNum2 - positionOfNum1 - 1;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {3, 2, 1, 4};

        int num1 = 2; 

        int num2 = 4;

        System.out.println(countNumber( arr, num1, num2));
    }
}