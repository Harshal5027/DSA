
//      Peak the element which is not smaller than its neighbors

package Assignments.Array.Array_Basic;

public class Program36 {

    static void peakElement(int arr[], int N){

        for( int i = 0; i < N; i++){

            if( i == 0){
                if( arr[i] > arr[i+1]){
                    System.out.println(arr[i]);
                }
            }else if( i == N-1 ){
                if( arr[i] > arr[i-1]){
                    System.out.println(arr[i]);
                }
            }else{
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {10, 20, 15, 2, 23, 90, 67};

        peakElement( arr, arr.length);
    }
    
}
