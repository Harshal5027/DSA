
//      CircularQueue using LinkedList

package Daily_Programs.Queues.CircularQueue;

import java.util.Scanner;

public class CircularQueue2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a Size for Queue : ");
        // int size = sc.nextInt();
        CircularQueueLinkedListOperation q = new CircularQueueLinkedListOperation();
        
        char ch;
        do {

            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("3.empty");
            System.out.println("4.front");
            System.out.println("5.rare");
            System.out.println("6.printQueue");
            System.out.print("Enter a choise : ");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                {
                    System.out.print("Enter a element : ");
                    int element = sc.nextInt();
                    int temp = q.enqueue(element);
                    if(temp != -1){
                        System.out.println(temp + " were added in the Queue ");
                    }else{
                        System.out.println("Queue is full");
                    }
                }
                break;
                case 2:
                {
                    int element = q.dequeue();
                    if(element != -1){
                        System.out.println(element + " is delete from Queue");
                    }else{
                        System.out.println("Queue is empty");
                    }
                }
                break;
                case 3:
                {
                    if(!q.empty()){
                        System.out.println("Queue is not Empty");
                    }else{
                        System.out.println("Queue is Empty");
                    }
                }
                break;
                case 4:
                {
                    int element = q.front();
                    if(element == -1){
                        System.out.println("Queue is Empty");
                    }else{
                        System.out.println(element);
                    }
                }
                break;
                case 5:
                {
                    int element = q.rare();
                    if(element == -1){
                        System.out.println("Queue is Empty");
                    }else{
                        System.out.println(element);
                    }
                }
                break;
                case 6:
                {
                    q.printQueue();
                }
                break;
                default:
                {
                    System.out.println("Incorrect Choise");
                    break;
                }
            }
            System.out.print("Do you want to continue : ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        sc.close();
    }
}

class CircularQueueLinkedListOperation{

    Node front;
    Node rear;

    //Constructor for first inisilize the instant variable
    CircularQueueLinkedListOperation(){
        this.front = null;
        this.rear = null;

    }

    //Node class for the create Node 
    public class Node{
        int data;
        Node next = null;

        Node( int data){
            this.data = data;
        }
    }

    //methode for the add the element in the Circularqueue
    int enqueue( int data ){

        Node newNode = new Node(data);

        if(front == null){
            front = rear = newNode;
            rear.next = front;
            return front.data;
        }
        rear.next = newNode;
        rear = newNode;   
        rear.next = front;     
        return rear.data;
    }

    //method for delete element from queue
    int dequeue(){

        if(front == null){
            return -1;
        }

        int elemet = front.data;
        front = front.next;
        rear.next = front;

        return elemet;
    }

    //method for check queue is empty or not
    boolean empty(){
        if(front == null){
            return true;
        }else{
            return false;
        }
    } 

    //method for check front of the Queue
    int front(){
        if(front == null){
            return -1;
        }
        return front.data;
    }

    //method for check rear of the queue
    int rare(){
        if (front == null) {
            return -1;
        }
        // System.out.println(rear.next.data);
        return rear.data;
    }

    //method for print the queue
    void printQueue(){

        if( front == null){
            System.out.println("Queue is empty!!!");
            return;
        }
        Node temp = front;
        System.out.print("[");
        while (temp != null) {
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
        System.out.println("]");
    }
}