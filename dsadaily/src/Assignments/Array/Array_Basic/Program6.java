
//////////////////////////Elements in the range/////////////////////////////////////////

package Assignments.Array.Array_Basic;

public class Program6 {
    
    public static void main(String[] args) {
        
        int arr[]=new int[]{1,4,5,2,7,8,3};

        int N=arr.length;

        int range1=2;
        int range2=5;

        int count=0;

        for(int i=0;i<N; i++){
            if(arr[i]>=range1&&arr[i]<=range2){
                count++;
            }
        }
        if(count==range2-range1+1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}

/////////////////////////Not working for duplicate elements////////////////////////////////////////////
