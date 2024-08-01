package Assignments.Array_Basic;

public class Program2 {
    public static void main(String[] args) {
        
        int arr[]={3,2,1,56,10000,167};

        int N=arr.length;

        int min=Integer.MAX_VALUE;

        int max=Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("minimun : "+min);
        System.out.println("maximum : "+max);
    }
}
