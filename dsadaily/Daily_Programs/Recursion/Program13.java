package Daily_Programs.Recursion;

import java.util.*;

public class Program13 {

    static int factorial(int num){

        if(num==0){
            return 1;
        }
        return num * factorial(num-1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(factorial(5));

    }
    
}
