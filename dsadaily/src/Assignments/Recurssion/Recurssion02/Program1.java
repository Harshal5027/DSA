
//     Factorial of the given number using For loop and Recurssion

package Assignments.Recurssion.Recurssion02;

public class Program1 {
 
    // static int factorial(int num){
    //     int fact = 1;
    //     for(int i = num; i>0; i--){
    //         fact=fact*i;
    //     }

    //     return fact;
    // }
    // public static void main(String[] args) {
        
    //     int num = 5;

    //     System.out.println("Factorial of a Given Number is "+factorial(num));

    // }

    static int factorial(int num){
        if(num==0){
            return 1;
        }

        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        
        int num = 5;

        System.out.println("Factorial of a given Number is "+factorial(num));
    }

}