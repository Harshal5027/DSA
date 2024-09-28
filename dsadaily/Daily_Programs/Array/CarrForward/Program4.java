/*
 * LeftMax without using exctra Time Complexity
 */

package Daily_Programs.Array.CarrForward;

public class Program4 {
    
    public static void main(String[] args) {

        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int N = arr.length;
        
        int max = Integer.MIN_VALUE;

        for(int i = 1; i < N; i++){

            if(arr[i] > max)
                max = arr[i];

            else
                arr[i] = max;
            

        }

        for( int i = 0; i < N; i++){

            System.out.print(arr[i]+" ");
        }
    }
}
