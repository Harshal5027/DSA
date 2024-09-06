package Daily_Programs.PrefixSum;

public class Program3 {

    public static void main(String[] args) {
        
        int arr[] = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

        int N = arr.length;

        for( int i = 1; i < N; i++){

            arr[i] = arr[i-1] + arr[i];

        }

        for( int i = 0; i < N; i++){

            System.out.println(arr[i]);
        }
        
    }
    
}
