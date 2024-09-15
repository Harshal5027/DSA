
//      Bitonic Point

package Assignments.Array.Array_Easy;

public class Program19 {

    static int bitonicPoint( int arr[], int N ){

        int start = 0;
        int end = N - 1;

        while( start < end ){

            int mid = (start + end) / 2;

            // System.out.println(mid);

            if( arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){

                return mid;

            }
            
            if( arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1] ){

                start = mid + 1;
                
            }else if( arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1] ){

                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 45, 47, 50, 5};

        int N = arr.length;

        int i = bitonicPoint( arr, N);

        System.out.println(arr[i]);
    }
    
}
