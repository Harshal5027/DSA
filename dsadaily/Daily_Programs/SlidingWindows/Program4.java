
/*--------------------------------------Sliding Window------------------------------------ */

package Daily_Programs.SlidingWindows;

public class Program4 {

    public static void main(String[] args) {
        
        int arr [] = new int []{ -3, 4, -2, 5, 3, -2, 8, 2, 1, 4};

        int N = arr.length;

        int k=10;

        int sum=0;

        for( int i=0; i<k ; i++){

            sum=sum+arr[i];

        }

        int totalSum=sum;
        int start=1;
        int end =k;
        while(end< arr.length){

            sum=sum-arr[start-1]+arr[end];

            if(totalSum<sum){
                totalSum=sum;
            }
            start++;
            end++;

        }

        System.out.println(totalSum);

    }
    
}
