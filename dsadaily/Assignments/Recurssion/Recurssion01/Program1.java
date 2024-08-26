
//      Using recurssion print the 1 - 10 numbers

package Assignments.Recurssion.Recurssion01;

public class Program1 {


    static void print1to10(int x){

        if( x == 0){
            return ;
        }

        print1to10(--x);

        System.out.println(x+1);

    }

    public static void main(String[] args) {
        
        int x = 10;

        print1to10(x);
    }
    
}
