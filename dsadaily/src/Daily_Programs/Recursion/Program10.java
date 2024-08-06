
/* Double recurssion */


package Daily_Programs.Recursion;

public class Program10 {

    void fun(int num){
        
        if( num <= 1)
            return;

        fun(num-2);

        System.out.println(num);

        fun(num-1);
    }

    public static void main(String[] args) {
        Program10 obj = new Program10();

        obj.fun(5);
    }
    
}
