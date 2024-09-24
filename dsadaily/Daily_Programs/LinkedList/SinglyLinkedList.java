
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

class Node{

    int data;

    Node next = null;

    Node(int data){
        this.data = data;
    }
}

public class SinglyLinkedList {
    
    Node head = null;

    void addFirst( int data ){

        Node newNode = new Node(data);

        if( head == null ){
            head = newNode;
            return;
        }
        newNode.next = head;

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
        temp.next = temp.next.next;

    }

    void printSLL( ){

        if( head == null){

            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;

        while( temp != null){

            System.out.print(temp.data+"->");

            temp = temp.next;
        }
        System.out.println("null");
    }
}

class LinkedList{

    public static void main(String[] args) {
        
        SinglyLinkedList newSinglyLinkedList = new SinglyLinkedList();

        newSinglyLinkedList.addFirst(10);
        newSinglyLinkedList.addFirst(20);

         newSinglyLinkedList.addLast(30);

         newSinglyLinkedList.addLast(40);

        // newSinglyLinkedList.addAtPos(0, 0);

         newSinglyLinkedList.addAtPos(1, 100);

         newSinglyLinkedList.addAtPos(6, 700);

         newSinglyLinkedList.addAtPos(5, 500);

         newSinglyLinkedList.deleteFirst();

         newSinglyLinkedList.deleteLast();

         newSinglyLinkedList.deleteAtPos(5);

        newSinglyLinkedList.printSLL();

        System.out.println(newSinglyLinkedList.nodeCount());
    }
}