package Assignments.LinkedList;

public class ProgramLinkedList {

    int count;

    class Node{
        int data;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }

    Node head = null;

    void addFirst( int data ){

        Node newNode = new Node(data);

        if( head == null ){
            head = newNode;
            count++;
            return;
        }
        newNode.next = head;
        head = newNode;
        count++;
    }

    int size(){

        return count;
    }
    void printll(){
        if( head == null ){
            System.out.println("Nothing to print");
            return;
        }

        Node temp = head;
        while( temp.next!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}
class Driver{

    public static void main(String[] args) {
        
        ProgramLinkedList pll = new ProgramLinkedList();

        pll.addFirst(10);
        pll.addFirst(20);
        pll.addFirst(30);
        pll.addFirst(40);
        pll.addFirst(50);
        pll.addFirst(60);

        pll.printll();

        System.out.println(pll.size());
    }
}