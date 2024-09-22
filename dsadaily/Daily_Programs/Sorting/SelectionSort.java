package Daily_Programs.Sorting;

public class SelectionSort {

    static void selectionSort( int arr[], int N){

        for( int i = 0; i < N-1; i++){

            int minIndex = i;
            for( int j = i+1; j < N; j++){

                if( arr[j] < arr[minIndex]){

                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {

        int arr[] = new int[]{ 9, 2, 7, 3, 1, 8, 4, 6};

        int N = arr.length;

        selectionSort( arr, N);

        for( int i = 0; i < N; i++){

            System.out.print(arr[i]+" ");
        }
    }
    
}