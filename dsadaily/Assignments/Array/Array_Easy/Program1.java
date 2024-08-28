
//      Missing Number in Array 

package Assignments.Array.Array_Easy;

public class Program1 {

    static int missingNumber( int N, int arr[]){

        int sum = 0;

        for( int i = 0; i < N-1; i++){
            
            sum = sum + arr[i];    
        }
        return N*(N+1)/2 - sum;
    }

    public static void main(String[] args) {
        
        int N = 11;

        int arr[] = {1, 3, 2, 5, 6, 7, 8, 11, 10, 4};

        System.out.println(missingNumber( N, arr));
    }
    
}
