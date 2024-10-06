package Daily_Programs.Array.CarrForward;

public class Program1 {
    public static void main(String[]args){
        int arr[]=new int[]{3,4,5,1,2,7,9,8};
        int N=7;

        int max = Integer.MIN_VALUE;
        for(int i=0; i<=3; i++){

            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
