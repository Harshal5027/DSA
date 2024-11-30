package Daily_Programs.Queues.Queue;

import java.util.Scanner;

public class Queue2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size for Queue : ");
        int size = sc.nextInt();
        QueueLinkedListOperation q = new QueueLinkedListOperation(size);

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

class QueueLinkedListOperation{
    //instant variable for array, front, rear, maxSize
    Node head;
    Node tail;
    int maxSize;
    int size;

    //Constructor for first inisilize the instant variable
    QueueLinkedListOperation(int size){
        this.maxSize = size;
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Node class for the create Node 
    public class Node{
        int data;
        Node next = null;

        Node( int data){
            this.data = data;
        }
    }

    //methode for the add the element in the queue
    int enqueue( int data ){

        Node newNode = new Node(data);

        if(size == maxSize){
            return -1;
        }
        if(head == null){
            head = tail = newNode;
            size++;
            return head.data;
        }
        tail.next = newNode;
        tail = newNode;   
        size++;     
        return tail.data;
    }

    //method for delete element from queue
    int dequeue(){

        if(head == null){
            return -1;
        }

        int elemet = head.data;
        head = head.next;
        size--;

        return elemet;
    }

    //method for check queue is empty or not
    boolean empty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    } 

    //method for check front of the Queue
    int front(){
        if(head == null){
            return -1;
        }
        return head.data;
    }

    //method for check rear of the queue
    int rare(){
        if (head == null) {
            return -1;
        }
        return tail.data;
    }

    //method for print the queue
    void printQueue(){
        Node temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
        System.out.println("]");
    }
}