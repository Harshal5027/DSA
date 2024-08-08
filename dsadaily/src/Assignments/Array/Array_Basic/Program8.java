package Assignments.Array_Basic;

public class Program8 {
    public static void main(String[] args) {
        int arr[]=new int[]{9,12,23,10,12,12,15,23,14,12,15};
        int N=arr.length;
        int count=0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}

