package Daily_Programs.LinkedList;


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
import java.util.*;

class Node{
    
    Node pre = null;
    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

public class DoublyLinkedList {
    
    Node head = null;

    void addFirst( int data ){

        Node newNode = new Node(data);

        if( head == null ){
            head = newNode;
            return;
        }

        newNode.next = head;
        head.pre = newNode;
        head = newNode;

    }

    void addLast( int data ){

        Node newNode = new Node(data);

        if( head == null){
            head = newNode; 
            return;
        }

        Node temp = head;

        while (temp.next != null) { 
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.pre = temp;

    }

    int nodeCount(){

        int count = 0;
        Node temp = head;

        while ( temp != null ) {
            count++;
            temp = temp.next;
        }

        return count;
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
        newNode.pre = temp;
        newNode.next.pre = newNode;
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
        head.pre = null;

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

        while( temp.next.next != null){
            temp = temp.next;
        }
        temp.next.pre = null;
        temp.next = null;

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
        temp.next.pre = null;
        temp.next = temp.next.next;
        temp.next.pre = temp;

    }

    void printSLL( ){

        if( head == null){

            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;

        while( temp != null){

            System.out.print("( "+temp.pre+" "+temp.data+" "+temp.next+") ->");

            temp = temp.next;
        }
        System.out.println("null");
    }
}

class LinkedList{

    public static void main(String[] args) {
        
        DoublyLinkedList newSinglyLinkedList = new DoublyLinkedList();

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
                    newSinglyLinkedList.addFirst(data);
                    break;

                case 2:
                    System.out.println("Enter a data");
                    data = sc.nextInt();
                    newSinglyLinkedList.addLast(data);
                    break;

                case 3:
                    System.out.println("Enter a Position");
                    pos = sc.nextInt();
                    System.out.println("Enter a data");
                    data = sc.nextInt();
                    newSinglyLinkedList.addAtPos(pos, data);
                    break;

                case 4:
                    newSinglyLinkedList.deleteFirst();
                    break;

                case 5:
                    newSinglyLinkedList.deleteLast();
                    break;

                case 6:
                    pos = sc.nextInt();
                    newSinglyLinkedList.deleteAtPos(pos);
                    break;

                case 7:
                    System.out.println("Print LinkedList");
                    newSinglyLinkedList.printSLL();
                    break;

                case 8:
                    System.out.println("Node count are : ");
                    System.out.println(newSinglyLinkedList.nodeCount());
                    break;
                
                default:
                    System.out.println("Invalid Choise");
                    break;
            }

            System.out.println("Do you want to continue");
            ch = sc.next().charAt(0);

        }while(ch == 'Y' || ch == 'y');

    }
}