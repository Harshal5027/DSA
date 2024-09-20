
//      Insertion Sort

package Daily_Programs.Sorting;

public class BubbleSortBYRecurssion {

    static void insertionSort( int arr[], int N){
        
        if( N == 1)
            return;

        boolean swapped = false;

        for( int i = 0; i < N-1; i++ ){

            if( arr[i] > arr[i+1]){

                int temp = arr[i];

                arr[i] = arr[i+1];

                arr[i+1] = temp;

                swapped = true;
            }

        }

        if( swapped == false ){

            return;

        }

        insertionSort(arr, N-1);

    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{ 64, 34, 25, 12, 22, 11, 90 };

        int N = arr.length;

        insertionSort( arr, N);

        for( int i = 0; i < N; i++){

            System.out.print(arr[i]+" ");
        }
    }
    
}