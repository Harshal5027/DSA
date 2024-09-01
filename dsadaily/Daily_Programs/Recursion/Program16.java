
//   Code of Fibbonacci Series using For Loop 

package Daily_Programs.Recursion;

public class Program16 {


    static void fibonacciSeries(int num){

        int num1 =0; 
        int num2 =1;

        for(int i = 0; i <= num ; i++){

            System.out.print(num1 + " ");

            int num3 = num1+num2;
            num1 = num2;

            num2 = num3;
        }

    }
    public static void main(String[] args) {
        
        int num = 8;

        fibonacciSeries(num);

    }
    
}
