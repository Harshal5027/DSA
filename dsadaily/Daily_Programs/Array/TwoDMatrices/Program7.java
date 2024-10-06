
/* Given a rectangular matrix N*M
 * Convert the matrix to it transpose
 */

 package Daily_Programs.Array.TwoDMatrices;

public class Program7 {

    public static void main(String[] args) {
        
        int arr[][] = new int [4][5];

        arr[0] = new int[]{ 1, 2, 3, 4, 5};
        arr[1] = new int[]{ 6, 7, 8, 9, 10};
        arr[2] = new int[]{ 11, 12, 13, 14, 15};
        arr[3] = new int[]{ 16, 17, 18, 19, 20};
        
        int newarr[][] = new int[5][4];

        for(int i=0; i < newarr[0].length; i++){
            for(int j = 0; j < newarr.length; j++) {
                newarr[j][i] = arr[i][j];
                // System.out.print(newarr[i][j]+" ");
            }
            // System.out.println(newarr[i][j]);
        }

        for(int i=0; i<newarr.length; i++) {
            for(int j=0; j<newarr[0].length; j++) {
                System.out.print(newarr[i][j]+" ");
            }
            System.out.println();
        }
    }
}