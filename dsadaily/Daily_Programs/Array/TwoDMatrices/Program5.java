
                    /*Print all diagonal matrix of square matrix 
                    (right to left) or (left to right)
                    1.Starting from 0th row 
                    2.all diagonals */ 


package Daily_Programs.Array.TwoDMatrices;

public class Program5 {

    public static void main(String[] args) {

        int arr[][] = new int [4][4];
        arr[0] = new int[]{1 , 2 , 3, 4};
        arr[1] = new int[]{5 , 6 , 7 , 8};
        arr[2] = new int[]{9 , 10 , 11 , 12};
        arr[3] = new int[]{13 , 14 , 15 , 16};


        for( int i = 0 ; i < arr.length ; i++ ){

            int k=i;

            for( int j = 0 ; j <= i ; j++ ){

                System.out.print(arr[j][k]+" ");

                k--;
                

            }
            System.out.println();

        }

    }
    
}
