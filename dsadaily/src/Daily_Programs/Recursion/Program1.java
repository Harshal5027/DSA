
/* Recursion */

package Daily_Programs.Recursion;

public class Program1 {

    void numPrint(int num){

        if(num==11){
            return ;
        }

        System.out.println(num);

        this.numPrint(num+1);

    }
    public static void main(String[] args) {

        Program1 obj = new Program1();

        int N=1;

        obj.numPrint(N);
        
    }

}
