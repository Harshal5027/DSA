
/*   Singly LinkedList 
        -addFirst
        -addLast
        -addAtPos

        -deleteFirst
        -deleteLast
        -deleteAtPost
        -printSinglyLinkedList
        -nodeCount
*/
package Daily_Programs.LinkedList;

import java.util.*;

public class SinglyCircularLinkedList {

    class Node{

        int data;
        Node next = null;
    
        Node(int data){
            this.data = data;
        }
    }
    
    Node head = null;
    Node tail = null;

    void addFirst( int data ){

        Node newNode = new Node(data);

        if( head == null ){
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    void addLast( int data ){

        Node newNode = new Node(data);

        if( head == null){
            head = newNode; 
            newNode.next = head;
            tail = newNode;
            return;
        }

        // Node temp = head;

        tail.next = newNode;

        tail = newNode;

        tail.next = head;

    }

    int nodeCount(){

        int count = 0;
        Node temp = head;

        while ( temp.next != head ) {
            count++;
            temp = temp.next;
        }

        return count+1;
    }

    void addAtPos( int pos, int data){

        if( pos <= 0 || pos >= nodeCount()+2 ){
            System.out.println("Invalid Position");
            return;
        }

        if( pos == 1){
            addFirst(data);
            return;
        }

        if( pos == nodeCount()+1){
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        while ( pos - 2 != 0 ) {
            temp = temp.next;
            pos--;    
        }

        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    void deleteFirst(){

        if(head == null ){
            System.out.println("LinkedList is empty ");
            return;
        }
        if(nodeCount() == 1){
            head = null;
            return;
        }
        head = head.next;
        tail.next = head;

    }

    void deleteLast(){

        if (head == null) {

            System.out.println("Linked LIst Is empty ");
            return;    
        }

        if( nodeCount() == 1 ){

            head = null;
            return;
        }

        Node temp = head;

        while( temp.next.next != head){
            temp = temp.next;
        }
        tail.next = null;
        tail = temp;
        tail.next = head;

    }

    void deleteAtPos(int pos){

        if( pos <= 0 || pos > nodeCount()){
            System.out.println(" Invalid position ");
            return;
        }

        if( nodeCount() == 1 ){
            deleteFirst();
            return;

        }
        if( nodeCount() == pos ){
            deleteLast();
            return;

        }

        Node temp = head;
        while( pos - 2 != 0 ){
            temp = temp.next;
            pos--;
        }
        temp.next = temp.next.next;

    }

    void printSLL( ){

        if( head == null){

            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;

        System.out.println(head);
        while( temp.next != head){

            System.out.print("("+temp.data+" + "+ temp.next +") ->");

            temp = temp.next;
        }
        System.out.print("("+temp.data+" + "+ temp.next +") ->");
        // System.out.println("null");
        System.out.println();
    }
}

class LinkedList{

    public static void main(String[] args) {
        
        SinglyCircularLinkedList ll = new SinglyCircularLinkedList();

        // ll.addFirst(10);
        // ll.addFirst(20);
        // ll.addFirst(30);
        // ll.addFirst(40);

        // ll.addLast(50);
        // ll.addLast(60);

        // ll.printSLL();

        Scanner sc = new Scanner(System.in);

        char ch;

        int data;

        int pos;



        do{
            System.out.println(" Perform Operations \n 1.AddFirst\n2.AddLast\n3.AddAtPosition\n4.DeleteFirst\n5.DeleteLast\n6.DeleteAtPosition\n7.PrintLinkedList\n8.NodeCount ");

            System.out.println("Enter Choise ");
            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Enter a data");
                    data = sc.nextInt();
                    ll.addFirst(data);
                    break;

                case 2:
                    System.out.println("Enter a data");
                    data = sc.nextInt();
                    ll.addLast(data);
                    break;

                case 3:
                    System.out.println("Enter a Position");
                    pos = sc.nextInt();
                    System.out.println("Enter a data");
                    data = sc.nextInt();
                    ll.addAtPos(pos, data);
                    break;

                case 4:
                    ll.deleteFirst();
                    break;

                case 5:
                    ll.deleteLast();
                    break;

                case 6:
                    pos = sc.nextInt();
                    ll.deleteAtPos(pos);
                    break;

                case 7:
                    System.out.println("Print LinkedList");
                    ll.printSLL();
                    break;

                case 8:
                    System.out.println("Node count are : ");
                    System.out.println(ll.nodeCount());
                    break;
                
                default:
                    System.out.println("Invalid Choise");
                    break;
            }

            System.out.println("Do you want to continue");
            ch = sc.next().charAt(0);

        }while(ch == 'Y' || ch == 'y');

        sc.close();

    }
}