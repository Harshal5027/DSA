
//      Product Array Puzzle

package Assignments.Array.Array_Easy;

public class Program28 {

    static void productArrayPuzzle( int nums[], int N, int productArr[] ){

        int product = 1;

        int productWithoutZero = 1;

        int count = 0;

        for( int i = 0; i < N; i++ ){

            if( nums[i] == 0 ){
                count++;
                continue;
            }

            product = product * nums[i];

        }
        if( count >= 1){

            productWithoutZero = product;

            product = 0;
        }


        for( int i = 0; i < N; i++ ){

            if( nums[i] == 0 ){
                productArr[i] = productWithoutZero;
                continue;
            }
            productArr[i] = product / nums[i];

        }

    }

    public static void main(String[] args) {
        
        int nums[] = { 12, 0};

        int N = nums.length;

        int productArr[] = new int[N]; 

        productArrayPuzzle( nums, N, productArr);

        for( int i = 0; i < N; i++ ){

            System.out.println(productArr[i]+" ");

        }
    }
    
}