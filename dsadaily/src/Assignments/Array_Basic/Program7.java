package Assignments.Array_Basic;

public class Program7 {
    public static void main(String[] args) {

        int arr[]=new int[]{9,0,1,3,0};

        int N= arr.length;

        //int newarr[]=new int[N];
        
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i]<=arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            } 
            System.out.print(arr[i]+" ");
        }
    }
}
//----------------------------------- But tc is o(n)-------------------------------------------------------