
//      Smallest And Second Smallest elements in the array

package Assignments.Array.Array_Basic;

public class Program23 {

    public static void main(String[] args) {
        
        int arr[] = {2, 4, 3, 5, 6};


        int smallest = Integer.MAX_VALUE;

        int secondSmallest = Integer.MAX_VALUE;

        for( int i = 0; i < arr.length; i++){

            if( arr[i] < smallest){

                secondSmallest = smallest;

                smallest = arr[i];
            }else if( arr[i] < secondSmallest && arr[i] != smallest){

                secondSmallest = arr[i];
            }
        }

        System.out.println(smallest+ " "+ secondSmallest);
    }
    
}
