package Daily_Programs.Sorting;

public class QuickSort {

    static int partition( int arr[], int start, int end ){

        if( start < end ){

            int pivot = 
        }

    }

    static void quickSort( int arr[], int start, int end ){

        if( start < end ){

            int pivot = partition( arr, start, end);
    
        }
    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{ 13, 1, 7, 9, 11, 8, 3, 5};

        int N = arr.length;

        int start = 0;

        int end = N - 1;

        quickSort( arr, start, end );
    }
    
}