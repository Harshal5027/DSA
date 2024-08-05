package Daily_Programs.Recursion;

public class Program9 {

    int sum = 0;

    int fun(int num){

        if(num==0){
            return num;
        }
        

        return num%10 + fun(num/10);

    }

    public static void main(String[] args) {
        

        Program9 obj = new Program9();

        System.out.println(obj.fun(12345));
    }
    
}