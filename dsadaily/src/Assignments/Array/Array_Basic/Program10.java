package Assignments.Array_Basic;

public class Program10 {

    static int maxOddSum(int arr[],int N){

        int sum=0;
        int MinOdd=Integer.MAX_VALUE;

        boolean isOdd=false;

        for(int i=0; i<N; i++ ){
            if(arr[i]>0){
                sum=sum+arr[i];
            }

            if(arr[i]%2!=0){
                isOdd=true;
                if(MinOdd>Math.abs(arr[i])){
                    MinOdd=Math.abs(arr[i]);
                }
            }
        }
        if(isOdd==false)
            return -1;

            if(sum%2==0){
                sum=sum-MinOdd;
            }
        return sum;
    }

    public static void main(String[] args) {
        
        int arr[]=new int []{4,-3,3,-5};

        int N=arr.length;

        System.out.println("The maximum sum of the odd numbers is :"+maxOddSum(arr[], N));
    }
    
}
