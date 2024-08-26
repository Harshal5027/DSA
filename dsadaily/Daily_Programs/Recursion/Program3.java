package Daily_Programs.Recursion;

public class Program3 {

    void fun(int num){

        if(num == 0)
            return;

        fun(--num);

        System.out.println(num);
    }

    public static void main(String[] args) {

        System.out.println("Start Main");

        Program2 obj = new Program2();

        obj.fun(5);

        System.out.println("End Main");
        
    }
    
}