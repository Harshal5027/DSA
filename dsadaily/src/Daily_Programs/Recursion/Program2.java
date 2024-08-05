package Daily_Programs.Recursion;

public class Program2 {

    void fun(int num){

        if(num == 0)
            return;

        System.out.println(num);
        fun(--num);
    }

    public static void main(String[] args) {

        Program2 obj = new Program2();

        obj.fun(5);
        
    }
    
}