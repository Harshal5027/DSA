package Daily_Programs.SlidingWindows;

public class Program2 {

    public static void main(String[] args) {
        
        int arr [] = new int []{ -3, 4, -2, 5, 3, -2, 8, 2, 1, 4};

        int k=5;
        int start=0;
        int totalSum = Integer.MIN_VALUE;

        for(int i = k-1; i < arr.length; i++ ){


            int sum=0;
            for( int j = start; j <= i; j++  ){

                sum=sum+arr[j];
            }
            
            if(sum > totalSum){
                totalSum = sum;
            }
            start++;
        }

        System.out.println(totalSum);


    }
    
}
