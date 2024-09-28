package Daily_Programs.PrefixSum;

public class Program4 {

    public static void main(String[] args) {
        
        int arr[] = {5, 5, 5, 3};

        int N = arr.length;

        int count = 0;

        int max = Integer.MIN_VALUE;

        for( int i =0 ; i < N; i++){

            if( max < arr[i]) {

                max = arr[i];

                count = 0;
            }

            if( max == arr[i] ){
                count++;
            }
        }

        System.out.println(N-count);
    }
    
}
