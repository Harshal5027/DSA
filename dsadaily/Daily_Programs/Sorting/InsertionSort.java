package Daily_Programs.Sorting;

public class InsertionSort {

    static void insertionSort( int arr[], int N ){

        for( int i = 1; i < N; i++){

            int element = arr[i];

            int j = i - 1;

            while( j >= 0 && arr[j] > element){

                arr[j+1] = arr[j];

                j--;
            }

            arr[j+1] = element; 
        }
    }

    public static void main(String[] args) {
        
        int arr[] = new int[] { 8, 3, 1, 7, 5, 4, 2};

        int N = arr.length;

        insertionSort( arr, N);

        for( int i = 0; i < N; i++){

            System.out.print(arr[i]+" ");
        }
    }
    
}