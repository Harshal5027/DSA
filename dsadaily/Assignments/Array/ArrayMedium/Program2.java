//--------------------Pythagorian Triplet----------------------------------------

package Assignments.Array.ArrayMedium;

import java.util.Arrays;

public class Program2 {

    boolean PythagorianTriplet( int N, int arr[]){

        for( int i = 0; i < arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }

        Arrays.sort(arr);

        for( int i = N-1; i > 1; i--){

            int first = 0; int second = i - 1;

            while (first < second) {
                
                if (arr[first] + arr[second] == arr[i]) 
                    return true;

                if( arr[first] + arr[second] < arr[i])
                    first++;
                else
                    second--;

            }
        }

        return false;
    }


    public static void main(String[] args) {
        
        Program2 obj = new Program2();
        int N = 5;
        int arr[] = {3, 2, 4, 6, 5};

        System.out.println(obj.PythagorianTriplet(N, arr));
    }
    
}