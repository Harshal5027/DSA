package Assignments.Array_Basic;

import java.util.Arrays;

public class Program9 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        int N=arr.length;
        int indextoremove=1;

        // for(int i=indextoremove; i<N-1; i++){
        //     arr[i]=arr[i+1];
        // }
        // System.out.println(Arrays.toString(arr));
        for(int i=0; i<N; i++){
            if(i==indextoremove){
                continue;
            }
            System.out.print(arr[i]+" ");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////