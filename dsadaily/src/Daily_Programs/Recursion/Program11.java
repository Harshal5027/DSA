package Daily_Programs.Recursion;

public class Program11 {
    
    int fun (int num ) {

        if(num <= 1) {
            return  1;
        }

        return fun(num-2) + fun(num-1);


    }

    public static void main(String[] args) {
        
        Program11 obj = new Program11();

        int ret = obj.fun(5);

        System.out.println(ret);

    }
}