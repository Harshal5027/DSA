package Assignments.LinkedList;

public class LinkedList {

    int count;

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
            count++;
            return;
        }
        newNode.next = head;
        head = newNode;
        count++;
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

    int size(){

        return count;
    }


/* 3.Linked List Insertion
Create a link list of size N according to the given input literals. Each integer input is accompanied 
by an indicator which can either be 0 or 1 If it is 0, insert the integer in the beginning of the link
list. If it is 1, insert the integer at the end of the link list.
Hint: When inserting at the end, make sure that you handle NULL explicitly.

Example 1
Input:
LinkedList: 9->0->5->1->6->1->2->0->5->0
Output: 52956
Explanation:
Length of Link List = N = 5
I
9.0 indicated that 9 should be inserted in the beginning. Modified
Link List = 9.
51 indicated that 5 should be inserted in the end. Modified Link List 9,5.
61 indicated that 6 should be inserted in the end. Modified Link List = 9,5.6.
2.0 indicated that 2 should be inserted in the beginning Modified Link List 2,9,5,6.
5.0 indicated that 5 should be inserted in the beginning. Modified Link List = 5,2,9,5,6 Final linked list
 = 5, 2, 9, 5, 6.
Example 2:
Input:
LinkedList: 5->1->6->1->9->1
Output: 569
I
Expected Time Complexity: O(1) for insertAtBeginning() and O(N) for insertAtEnd() Expected Auxiliary 
Space: O(1) for both.
Constraints:
1< N <= 10^4 */
    void LLInsertion(LinkedList ll){
        
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
        
        LinkedList pll = new LinkedList();

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