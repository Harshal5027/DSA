package Daily_Programs.Stack.StackProblem;

import java.util.Scanner;
import java.util.*;

public class ParenthesisChecker {

    boolean validParenthesis( String str ){

        Stack<Character> s = new Stack<Character>();
        
        for( int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if( ch == '{' || ch == '[' || ch == '(' ){
                s.push(ch);
            }else{

                if(!s.empty()){

                    char x = s.peek();

                    if( (x == '{' && ch == '}') || (x == '[' && ch == ']' ) || (x == '(' && ch == ')')){
                        s.pop();
                    }else{
                        return false;
                    }

                }else{
                    return false;
                }
            }
        }
        if(s.empty()){
            return true;
        }else{
            return false;
        }
    }
    
}

class Driver{

    public static void main(String[] args) {

        ParenthesisChecker obj = new ParenthesisChecker();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a parenthesis to check : ");

        String str = sc.next();

        boolean validation = obj.validParenthesis(str);

        if( validation == true){
            System.out.println("Balanced");
        }else{
            System.out.println("NotBalanced");
        }
    }
}