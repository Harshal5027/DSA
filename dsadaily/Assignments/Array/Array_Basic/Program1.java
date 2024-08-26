package Assignments.Array.Array_Basic;

public class Program1 {

    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3,4,5};

        int N=5;

        int x=5;

        for(int i=0;i<N; i++){
            if(x==arr[i]){
                System.out.println(i);
            }
        }
    }
    
}
