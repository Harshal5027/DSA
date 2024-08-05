


package Daily_Programs.Recursion;

public class Program5 {

    void fun ( int num ) {

        int sum = 0;

        for ( int i = 1 ; i <= num ; i++){

            sum = sum + i ;
        }

        System.out.println(sum);


    }

    public static void main(String[] args) {
        
        System.out.println("Start main");

        Program5 obj = new Program5();

        obj.fun(5);

        System.out.println("End Main");


    }
    
}
