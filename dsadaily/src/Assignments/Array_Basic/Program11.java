package Assignments.Array_Basic;

public class Program11 {

    static int productMaxMin(int arr1[],int arr2[],int N1,int N2){

        int product=1;

        int MaxArray1=Integer.MIN_VALUE;
        int minArray2=Integer.MAX_VALUE;

        for(int i=0 ;i<N1; i++){
            if(MaxArray1<arr1[i]){
                MaxArray1=arr1[i];
            }
        }
        for(int i=0;i<N2; i++){
            if(minArray2>arr2[i]){
                minArray2=arr2[i];
            }
        }


        return MaxArray1*minArray2;
    }

    public static void main(String[] args) {
        
        int arr1[]=new int[]{5,7,9,3,6,2};
        int arr2[]=new int[]{1,2,6,-1,0,9};

        int N1=arr1.length;
        int N2=arr2.length;

        System.out.println("The product of the maximum in the first array and minimum in the second array :"+productMaxMin(arr1,arr2,N1,N2));
    }
    
}

