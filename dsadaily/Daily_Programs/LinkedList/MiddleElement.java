package Daily_Programs.LinkedList;

import java.util.Scanner;

public class MiddleElement {

    class Node{

        int data;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }

    Node head = null;
    void addFirst(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    int countNode(){
        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    int middleElement(){
        if (head == null) {

            System.out.println("LinkedList is Empty!!!");
            return -1;
            
        }
        int len = countNode();
        Node temp = head;

        int count = 0;
        while (count < len/2) {
            temp = temp.next;
            count++;
        }
        return temp.data;
    }
    void printSll(){

        Node temp = head;
        System.out.print("[");
        while( temp != null){

            System.out.print(temp.data+" ");
            temp = temp.next;
            
        }
        System.out.println("]");
    }  
}

class Client{

    public static void main(String[] args) {

        MiddleElement element = new MiddleElement();
        
        Scanner sc = new Scanner(System.in);

        char ch;

        do {
            
            System.out.println("1.Add element");
            System.out.println("2.Find Middle Element");
            System.out.println("3.PrintLinkedList");
            System.out.print("\nSelect the Choise : ");

            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    System.out.print("Enter a element : ");
                    element.addFirst(sc.nextInt());
                    break;

                case 2 :
                    int val = element.middleElement();
                    if(val != -1)
                        System.out.println("Middle Element of the LinkedList is : "+ val);

                    break;

                case 3: 
                    element.printSll();
                    break;
            
                default:
                    System.out.println("Invalid choise");
                    break;
            }
            System.out.print("Do you want you continue : ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch =='Y');

        sc.close();
    }
}