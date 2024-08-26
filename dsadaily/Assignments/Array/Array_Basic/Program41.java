
//      Countries at War

package Assignments.Array.Array_Basic;

public class Program41 {

    static void countriesAtWar( int A[], int B[] ){

        int killA = 0;
        int killB = 0;

        for( int i = 0; i < A.length; i++){

            if(A[i] == B[i]){

                continue;

            }else if ( A[i] > B[i] ){ 

                killB++; 

            }else{

                killA++;

            }
        }
        if( killA == killB ){

            System.out.println("No one has won");
        }else if( killA > killB ){

            System.out.println("B");
        }else{
            
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
        
        int A[] = {9};

        int B[] = {8};

        countriesAtWar( A, B);
    }
    
}
