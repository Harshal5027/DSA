
//-------------------------------------------ROW Wise Sum-------------------------------------------

package Daily_Programs.Array.TwoDArray;

public class Program3 {

    public static void main(String[] args) {
        
        int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        int N=arr.length;

        for(int i=0; i<N; i++){
            int sum=0;
            for(int j=0; j<arr[i].length; j++){
                sum=sum+arr[i][j];
            }
            System.out.println(sum);
        }

    }
    
}
