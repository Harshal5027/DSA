
//    Check if pair with given sum exist in array(Two Sum) 

package Assignments.Array.Array_Basic;

public class Program20 {

    static String sumPair( int arr[], int sum){

        for( int i = 0; i < arr.length; i++){

            for( int j = 0; j < arr.length; j++){

                if(arr[i]+arr[j] == sum){

                    return "Yes";
                }
            }
        }

        return "No";
    }
    public static void main(String[] args) {
        
        int arr[] = {0, -1, 2, -3, 1};

        int sum = -2;

        System.out.println(sumPair( arr, sum));
    }
}
