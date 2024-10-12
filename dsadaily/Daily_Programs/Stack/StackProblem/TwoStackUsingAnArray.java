package Daily_Programs.Stack.StackProblem;

import java.util.*;

public class TwoStackUsingAnArray {

    int stackArr[];
    int top1;
    int top2;
    int maximumSize;

    TwoStackUsingAnArray(int size){

        this.stackArr = new int[size];
        this.top1 = -1;
        this.top2 = size;
        this.maximumSize = size;
    }

    void push1( int data){

        if( top2 - top1 > 1){
            top1++;
            stackArr[top1] = data;
        }else{
            System.out.println("Stack Overflow");
        }
    }
    void push2( int data){

        if( top2 - top1 > 1){
            top2--;
            stackArr[top2] = data;
        }else{
            System.out.println("Stack Overflow");
        }
    }

    int pop1(){
        if(top1 == -1){
            System.out.println("Stack1 is empty!!!");
            return -1;
        }else{
            int val = stackArr[top1];
            top1--;
            return val;
        }
    }

    int pop2(){
        if(top2 == maximumSize){
            System.out.println("Stack2 is empty!!!");
            return -1;
        }else{
            int val = stackArr[top2];
            top1++;
            return val;
        }
    }
}

class Client{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of an Array : ");

        int size = sc.nextInt();

        TwoStackUsingAnArray obj = new TwoStackUsingAnArray(size);

        char ch;

        do {

            System.out.println("1.Push1");
            System.out.println("2.Push2");
            System.out.println("3.Pop1");
            System.out.println("4.Pop2");

            System.out.print("Enter Your Choise : ");
            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    {
                        System.out.print("Enter Element for stack1 : ");
                        int data = sc.nextInt();
                        obj.push1(data);
                        break;
                    }

                case 2:
                    {
                        System.out.print("Enter Element for stack2 : ");
                        int data = sc.nextInt();
                        obj.push2(data);
                        break;
                    }

                case 3: 
                    {
                        int ret = obj.pop1();
                        if(ret != -1){
                            System.out.println(ret + " poped from stack1");
                        }
                        break;
                    }

                case 4:
                    {
                        int ret = obj.pop2();
                        if(ret != -1){
                            System.out.println(ret + " poped from stack2");
                        }
                        break;
                    }

                default:
                    System.out.println("Invalid Choise");
                    break;
            }

            System.out.print("Do you want to continue : ");
            ch = sc.next().charAt(0);
            
        } while (ch == 'Y'||ch=='y');
    }

    private static int pop1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop1'");
    }
}