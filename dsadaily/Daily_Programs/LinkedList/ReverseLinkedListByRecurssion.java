package Daily_Programs.LinkedList;

import java.util.Scanner;

public class ReverseLinkedListByRecurssion {

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

    void reverseLinkedList(Node previous, Node current){

        if( current == null || current.next == null)
            return;

        
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

        ReverseLinkedListByRecurssion rl = new ReverseLinkedListByRecurssion();
        
        Scanner sc = new Scanner(System.in);

        char ch;

        do {
            
            System.out.println("1.Add element");
            System.out.println("2.Reverse LinkedList");
            System.out.println("3.PrintLinkedList");
            System.out.print("\nSelect the Choise : ");

            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    System.out.print("Enter a element : ");
                    rl.addFirst(sc.nextInt());
                    break;

                case 2:
                    Node previous = null;
                    Node current = rl.head;
                    rl.reverseLinkedList(previous, current);
                    break;

                case 3: 
                    rl.printSll();
                    break;
            
                default:
                    System.out.println("Invalid choise");
                    break;
            }
            System.out.print("Do you want you continue : ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch =='Y');
    }
}