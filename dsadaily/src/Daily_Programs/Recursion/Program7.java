package Daily_Programs.Recursion;

public class Program7 {

    int sum = 0;

    int fun( int num){

        

        if ( num == 0 ){
            return 1 ;
        }

        sum = sum + num;

        System.out.println(num);

        fun(--num);
        // System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        
        Program7 obj = new Program7();

        System.out.println(obj.fun(5));

    }
    
}
