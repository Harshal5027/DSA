
//-------------------------Column wise sum------------------------------------------

package Daily_Programs.TwoDArray;

public class Program4 {

    public static void main(String[] args) {
        
        int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        // int N=arr.length;

        for(int i=0; i<arr[0].length; i++){
            int sum=0;
            for(int j=0; j<arr.length; j++){
                sum=sum+arr[j][i];
            }
            System.out.println(sum);
        }

    }
    
}
