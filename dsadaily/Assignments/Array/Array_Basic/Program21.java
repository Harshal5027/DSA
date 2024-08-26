
//    First element to occur to k times

package Assignments.Array.Array_Basic;

public class Program21 {

    static int elementOccur( int arr[], int K){

        for( int i = 0; i < arr.length; i++){

            int count = 0;

            for( int j = 0; j <=i; j++){

                if(arr[i]==arr[j]){

                    count++;

                }
            }
            if(count == K){
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 7, 4, 3, 4, 8, 7};

        int K = 2;

        System.out.println(elementOccur(arr, K));
    }
    
}