
//      Largest element in array

package Assignments.Array_Basic;

public class Program3 {
    public static void main(String[] args) {
        int largestelement=Integer.MIN_VALUE;

        int arr[]=new int[]{1,8,7,5,56,90};
        int N=arr.length;

        for(int i=0; i<N; i++){
            if(largestelement<=arr[i]){
                largestelement=arr[i];
            }
        }
        System.out.println(largestelement);
    }    
}