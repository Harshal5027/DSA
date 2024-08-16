
//   Sum of the N natural Numbers 

package Assignments.Recurssion.Recurssion01;

public class Program3 {

    static int sumNatural(int x){

        if(x == 0) {
            return 1;
        }

        sumNatural(--x);

        return x = x + x ;

    }

}