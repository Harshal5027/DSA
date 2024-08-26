
//    Product of the maximum in first array and minimum in the second array

package Assignments.Array.Array_Basic;

public class Program17 {

    static int productMinMax( int arr1[], int arr2[]){

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        for( int i = 0; i < arr1.length; i++){

            if(arr1[i] >= max){

                max = arr1[i];
            }
        }
        for( int i = 0; i < arr2.length; i++){

            if(arr2[i] <= min){

                min = arr2[i];
            }
        }

        return max*min ;

    }

    public static void main(String[] args) {
        
        int arr1[] = {5, 7, 9, 3, 6, 2};

        int arr2[] = {1, 2, 6, -1, 0, 9};

        System.out.println(productMinMax( arr1, arr2));
    }
    
}
