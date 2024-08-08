
// First 10 natural numbers in reverse order

package Assignments.Recurssion.Recurssion01;

public class Program2 {
    
    static void firstNatural(int x){

        if(x == 0){
            return ;
        }

        System.out.println(x);

        firstNatural(--x);

    }
    public static void main(String[] args) {
        
        int x = 10;

        firstNatural(x);


    }

}
