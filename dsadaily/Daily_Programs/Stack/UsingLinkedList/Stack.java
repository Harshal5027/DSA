package Daily_Programs.Stack.UsingLinkedList;

import java.util.Scanner;

public class Stack {

    int maxSize;
    int size = 0;

    Stack(int maxSize){
        this.maxSize = maxSize;
    }

    public class Node{
        int data;
        Node next = null;

        Node( int data){
            this.data = data;
        }
    }

    Node head = null;
    // Node top = null;

    int push( int data ){

        Node newNode = new Node(data);

        if(size == maxSize){
            System.out.println("Stack OverFlow!!!");
            return -1;
        }
        
        if(head == null){

            head = newNode;
            size++;
            return head.data;
        }

        newNode.next = head;
        head = newNode;   
        size++;     
        return head.data;
    }

    int pop(){
        if(head == null){
            System.out.println("Stack is empty!!!");
            return -1;
        }

        if(size == 1){                              
            int val = head.data;
            head = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    int peek(){

        if(head == null){
            System.out.println("Stack is Empty!!!");
            return -1;
        }
        return head.data;
    }

    int size(){

        return size;
    }

    boolean empty(){

        if(head == null)
            return true;
        else
            return false;
    }

    Node temp = head;
    void printStack(){

        if (temp == null) {
            System.out.print("[ ");
            return;
        }
        temp = temp.next;
        printStack();

        System.out.print(temp.data+" ");
    }
}

class Client{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of a stack : ");
        int maxSize = sc.nextInt();

        Stack s = new Stack(maxSize);

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
                        System.out.println(element1+" is push in the stack");
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
                    int size1 = s.size();
                    System.out.println("The size of the stack is : "+ size1);

                    break;

                case 6 :
                    s.printStack();
                    System.out.println("]");
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