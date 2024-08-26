package Daily_Programs.Recursion;

public class Program6 {

    int  fun ( int num ) {

        if( num == 1)
            return num;

        return num + fun(--num);

        

    }

    public static void main(String[] args) {
        
        Program6 obj = new Program6();

        System.out.println(obj.fun(5));

    }
    
}
