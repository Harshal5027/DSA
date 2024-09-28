package Daily_Programs.CarrForward;

public class Program2 {
    public static void main(String[] args) {
        int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int N=10;
        
        int[] leftmax=new int[N];
       // int max=Integer.MIN_VALUE;
        leftmax[0]=arr[0];

        for(int i=1; i<N; i++){

            if(arr[i]>leftmax[i-1]){
                leftmax[i]=arr[i];
            }else{
                leftmax[i]=leftmax[i-1];
            }
        }
        


    }
}
