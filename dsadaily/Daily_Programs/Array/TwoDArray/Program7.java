package Daily_Programs.Array.TwoDArray;

public class Program7 {
    
    public static void main(String[] args) {

        int arr[][]=new int[4][5];

        arr[0]=new int[]{1,2,3,4,5,3};
        arr[1]=new int[]{6,7,8,9,10,5};
        arr[2]=new int[]{11,12,13,14,15,7};
        arr[3]=new int[]{16,17,18,19,20,8};

        for(int i=arr[0].length-1; i>=0; i--){

            int j=i;
            int k=0;

            while( k<=arr.length-1 && j>=0 ){
                System.out.print(arr[k][j]+" ");

                k++;
                j--;
            }
            System.out.println();
        }
    }

}