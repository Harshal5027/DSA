

// The Product of the Digit of the Given Number using for loop and recurssion

package Assignments.Recurssion.Recurssion02;

public class Program2 {

    // static int productOfDigit(int num){
        
    //     int product = 1;
    //     while(num>0){
    //         int rem = num%10;
    //         product=product*rem;

    //         num=num/10;
    //     }
    //     return product;

    // }

    // public static void main(String[] args) {
    //     int num = 12345;

    //     System.out.println(productOfDigit(num));
    // }

    static int productOfDigit(int num){
        if(num==0){
            return 1;
        }

        return num%10 * productOfDigit(num/10);
    }
    
    public static void main(String[] args) {
        
        int num = 12345;

        System.out.println("The Product of the digit in a given Number is "+productOfDigit(num));
    }

}