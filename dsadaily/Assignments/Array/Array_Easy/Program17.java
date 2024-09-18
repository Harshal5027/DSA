
//      Find the all pair with the given sum

package Assignments.Array.Array_Easy;

public class Program17 {

    static void findPairWithGivenSum( int A[], int B[], int NA, int NB, int X ){

        for( int i = 0; i < NA; i++){

            for( int j = 0; j < NB; j++){

                if(A[i] + B[j] == X){
                    System.out.print(A[i]+" & "+B[j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int A[] = { 1, 2, 4, 5, 7};

        int B[] = { 5, 6, 3, 4, 8 };

        int NA = A.length;

        int NB = B.length;

        int X = 9;

        findPairWithGivenSum( A, B, NA, NB, X);
    }
    
}
