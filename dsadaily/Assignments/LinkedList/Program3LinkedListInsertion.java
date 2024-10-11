package Assignments.LinkedList;

public class Program3LinkedListInsertion {

    class Node{

        int data;
        Node next = null;

        Node( int data ){
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void addFirst( int data ){
        Node newNode = new Node(data);
        if( head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast( int data ){

        Node newNode = new Node(data);

        if( head == null ){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void printll(){
        if( head == null ){
            System.out.println("Nothing to print");
            return;
        }

        Node temp = head;
        while( temp.next!= tail){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    
}
class Driver{

    public static void main(String[] args) {
        
        Program3LinkedListInsertion pll = new Program3LinkedListInsertion();

        pll.addFirst(10);
        pll.addFirst(20);
        pll.addFirst(30);
        pll.addFirst(40);
        pll.addFirst(50);
        pll.addFirst(60);

        pll.printll();

        // System.out.println(pll.size());
    }
}