package Daily_Programs.Array.TwoDArray;

public class Program6 {

    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3,4,26},{5,6,7,8,67},{9,10,11,12,78},{13,14,15,16,60}};
        int N = arr[0].length;

        int i = 0;
        int j = N-1;
        while( i < N-1 && j  > 0 ){
            System.out.println(arr[i][j] + " ");
            i++;
            j--;
        }
    }
    
}
