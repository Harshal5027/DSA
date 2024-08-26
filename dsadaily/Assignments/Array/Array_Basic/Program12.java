
//  First And Last Occurance of the index

package Assignments.Array.Array_Basic;

import java.util.ArrayList;

public class Program12 {

    static void occurance(int arr[],int N , int x){

        int firstIndex=0;
        int lastIndex=0;

        int count=0;

        for(int i=0; i<N; i++){
            if(count==1){
                firstIndex=i-1;
                count=2;
            }
            if(arr[i]==x){
                if(arr[i]==x){
                    count++;
                }
                lastIndex=i;
            }
        }
        System.out.println("First and last occurance are :"+firstIndex+" "+lastIndex);
    }

    public static void main(String[] args) {
        
        int arr[]=new int[]{1,3,5,4,4,6,3,5,2};
        int N=arr.length;
        int x=3;

        occurance(arr, N, x);
    }
    
}
