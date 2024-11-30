//DEQueue using LinkedList Implementation

package Daily_Programs.Queues.DEQueue;

import java.util.Scanner;

public class DEQueue2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DEQueueLinkedListOperation q = new DEQueueLinkedListOperation();

        char ch;
        do {
            System.out.println("1.EnQueueAtFirst");
            System.out.println("2.EnQueueAtLast");
            System.out.println("3.DeQueueAtFirst");
            System.out.println("4.DeQueueAtLast");
            System.out.println("5.Empty");
            System.out.println("6.Front");
            System.out.println("7.Rare");
            System.out.println("8.PrintQueue");

            System.out.print("Select the choise : ");
            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    {
                        System.out.print("Enter a element : ");
                        int elelment = sc.nextInt();
                        int temp = q.enqueueAtFirst(elelment);
                        if(temp != -1){
                            System.out.println(temp + " is added in the Queue");
                        }else{
                            System.out.println("Queue is Full");
                        }
                    }
                    break;

                case 2:
                    {
                        System.out.print("Enter a element : ");
                        int elelment = sc.nextInt();
                        int temp = q.enqueueAtLast(elelment);
                        if(temp != -1){
                            System.out.println(temp + " is added in the Queue");
                        }else{
                            System.out.println("Queue is Full");
                        }

                    }
                    break;

                case 3:
                    {
                        int elelment = q.dequeueAtFirst();
                        if(elelment != -1){
                            System.out.println(elelment + " is delete from the Queue");
                        }else{
                            System.out.println("Queue is Empty");
                        }
                    }
                    break;

                case 4:
                    {
                        int elelment = q.dequeueAtLast();
                        if(elelment != -1){
                            System.out.println(elelment + " is delete from the Queue");
                        }else{
                            System.out.println("Queue is Empty");
                        }   
                    }
                    break;

                case 5:
                    {
                        if(!q.empty()){
                            System.out.println("Queue is not Empty!!!");
                        }else{
                            System.out.println("Queue is Empty");
                        }
                    }
                    break;

                case 6:
                    {
                        System.out.println(q.front());
                    }
                    break;

                case 7:
                    {
                        System.out.println(q.rare());
                    }
                    break;

                case 8:
                    {
                        q.printQueue();
                    }
                    break;
            
                default:
                    System.out.println("Invalid Choise!!!");
                    break;
            }
            
            System.out.print("Do You want to Continue...? : ");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        sc.close();

    }

}

class DEQueueLinkedListOperation{

    class Node{

        int data;
        Node next = null;
        
        Node( int data){
            this.data = data;
        }
    }

    Node front = null;
    Node rare = null;

    //add element in the queue from the front
    int enqueueAtFirst(int data){
        
        Node newNode = new Node(data);

        if(front == null){
            front = rare = newNode;
            return front.data;
        }
        newNode.next = front;
        front = newNode;
        return front.data;
    }

    //add the element in the queue from the rare
    int enqueueAtLast(int data){

        Node newNode = new Node(data);

        if(front == null){
            front = rare = newNode;
            return rare.data;
        }
        rare.next = newNode;
        rare = newNode;
        return rare.data;
    }

    //delete element from the queue from the first
    int dequeueAtFirst(){
        if (front == null) {
            return-1;
        }

        int ret = front.data;
        if( front == rare ){
            front = rare = null;
        }else{
            front = front.next;
        }
        return ret;
    }

    //delete element from the queue from the last
    int dequeueAtLast(){

        if( rare == null){
            return -1;
        }

        int ret = rare.data;

        if( rare == front){
            rare = front = null;
        }else{
            Node temp = front;

            while (temp.next != rare) {
                temp = temp.next;
            }
            temp.next = null;
            rare = temp;
        }
        return ret;
    }

    //method for to check the queue is empty or not
    boolean empty(){
        if(front == null){
            return true;
        }else{
            return false;
        }
    }

    //method for to check the front of the queue 
    int front(){

        return front.data;
    }

    //method for to check the rare of the queue
    int rare(){

        return rare.data;
    }

    //method for print the queue
    void printQueue(){

        Node temp = front;
        
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("]");
    }

}