package Daily_Programs.Recursion;

public class Program8 {

    int fun(int num){
        int sum = 0;
        int i = num;
        while(i>0){

            int rem = i%10;
            sum = sum+rem;

            i=i/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Program8 obj = new Program8();

        System.out.println(obj.fun(12345));
    }
    
}
