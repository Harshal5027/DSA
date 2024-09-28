package Daily_Programs.SlidingWindows;


public class Program3 {

    public static void main(String[] args) {
        
        int arr [] = new int []{ -3, 4, -2, 5, 3, -2, 8, 2, 1, 4};

        int N = arr.length;

        int prearr[] = new int [N];

        prearr[0] = arr[0];
        for(int i = 1; i < N ; i++){

            prearr[i] = prearr[i-1]+arr[i];

        }

        int k=4;
        int sum=0;
        int totalSum = Integer.MIN_VALUE;

        for(int i = 0 ; i <=N-k ; i++ ){


            if(i==0){
                sum  = prearr[k-1];
            }else{
                sum = prearr[k-1+i] - prearr[i-1];
            }

            if(sum > totalSum){
                totalSum = sum;
            }
        }

        System.out.println(totalSum);


    }
    
}
