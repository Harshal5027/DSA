
//      Bubble sort 

package Daily_Programs.Sorting;

public class BubbleSort {
    
    static void bubbleSort( int arr[], int N){

        boolean swapped;

        int count = 0;

        for( int i = 0; i < N; i++){

            swapped = false;

            for( int j = 0; j < N - i-1; j++){

                if( arr[j] > arr[j+1]){

                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                    swapped = true;
                    
                    count++;
                }
            }

            if( swapped == false ){
                break;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        
        int arr[] = new int[] { 64, 34, 25, 12, 22, 11, 90};

        int N = arr.length;

        bubbleSort( arr, N);

        for( int i = 0; i < N; i++){

            System.out.print(arr[i]+" ");

        }
    }
}