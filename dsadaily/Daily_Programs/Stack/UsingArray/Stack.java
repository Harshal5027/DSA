package Daily_Programs.Stack.UsingArray;

import java.util.Scanner;

public class Stack {

    int maxSize;
    int stackArr[];
    int top = -1;

    Stack( int size ){

        this.stackArr = new int[size];
        this.maxSize = size;
    }

    int push(int element){

        if( top == maxSize-1){
            System.out.println("Stack Overflow!!!!");
            return -1;
        }else{
            top++;
            stackArr[top] = element;
        }
        return stackArr[top];
    }

    boolean empty(){

        if(top == -1)
            return true;

        else
            return false;
    }

    int pop(){

        if(empty()){
            System.out.println("Stack is empty!!!");
            return -1;
        }else{
            int val = stackArr[top];
            top--;
            return val;
        }
    }

    int peek(){

        if(empty()){
            System.out.println("Stack is empty!!!");
            return -1;
        }else{
            return stackArr[top];
        }
    }

    int size(){

        return top;
    }
    
    void printStack(){

        if(empty()){
            System.out.println("Stack is Empty!!!");
            return;
        }else{
            System.out.print("[ ");

            for( int val = 0; val < top; val++){
                System.out.print(stackArr[val]+" ");
            }
            System.out.println("]");
        }
    }
}

class Client{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The Stack size : ");
        Stack s = new Stack(sc.nextInt());

        char ch;

        do {
            
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.peek");
            System.out.println("4.isEmpty");
            System.out.println("5.size");
            System.out.println("6.Print");

            System.out.print("Enter The Choise : ");
            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    System.out.print("Enter the Element : ");
                    int element = sc.nextInt();
                    int element1 = s.push(element);
                    if(element1 != -1)
                        System.out.println(element1+" is push from the stack");
                    break;
                
                case 2 : 
                    int elementPop = s.pop();
                    if(elementPop != -1)
                        System.out.println(elementPop+" is poped from the stack");
                    break;

                case 3 :
                    int elementpeek = s.peek();
                    if(elementpeek != -1)
                        System.out.println(elementpeek + " is peek element");

                    break;

                case 4 :
                    if(s.empty())
                        System.out.println("Stack is empty!!!");
                    else
                        System.out.println("Stack is not empty!!!");

                    break;

                case 5 : 
                    int size = s.size() + 1;
                    System.out.println("The size of the stack is : "+ size);

                    break;

                case 6 :
                    s.printStack();
                    break;

                default:
                    System.out.println("Invalid Choise");
                    break;
            }
            System.out.print("Do you want to continue : ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');


        sc.close();

    }
}