
//          DEQueue using Array

package Daily_Programs.Queues.DEQueue;

import java.util.Scanner;

public class DEQueue1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size for Queue : ");
        int size = sc.nextInt();
        DEQueueArrayOperation q = new DEQueueArrayOperation(size);
        char ch;
        do {

            System.out.println("1.enqueueAtLast");
            System.out.println("2.enqueueAtFirst");
            System.out.println("3.dequeueAtFirst");
            System.out.println("4.dequeueAtLast");
            System.out.println("5.empty");
            System.out.println("6.front");
            System.out.println("7.rare");
            System.out.println("8.printQueue");
            System.out.print("Enter a choise : ");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                {
                    System.out.print("Enter a element : ");
                    int element = sc.nextInt();
                    int temp = q.enqueueAtLast(element);
                    if(temp != -1){
                        System.out.println(temp + " were added in the Queue ");
                    }else{
                        System.out.println("Queue is full");
                    }
                }
                break;

                case 2:
                {

                    System.out.print("Enter a element : ");
                    int element = sc.nextInt();
                    int temp = q.enqueueAtFirst(element);
                    if(temp != -1){
                        System.out.println(temp + " were added in the Queue ");
                    }else{
                        System.out.println("Queue is full");
                    }

                }
                break;

                case 3:
                {
                    int element = q.dequeueAtFirst();
                    if(element != -1){
                        System.out.println(element + " is delete from Queue");
                    }else{
                        System.out.println("Queue is empty");
                    }
                }
                break;

                case 4:
                {
                    int element = q.dequeueAtLast();
                    if(element != -1){
                        System.out.println(element + " is delete from Queue");
                    }else{
                        System.out.println("Queue is empty");
                    }
                }
                break;

                case 5:
                {
                    if(!q.empty()){
                        System.out.println("Queue is not Empty");
                    }else{
                        System.out.println("Queue is Empty");
                    }
                }
                break;

                case 6:
                {
                    int element = q.front();
                    if(element == -1){
                        System.out.println("Queue is Empty");
                    }else{
                        System.out.println(element);
                    }
                }
                break;
                case 7:
                {
                    int element = q.rare();
                    if(element == -1){
                        System.out.println("Queue is Empty");
                    }else{
                        System.out.println(element);
                    }
                }
                break;
                case 8:
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

class DEQueueArrayOperation{
    
    //instant variable for array, front, rear, maxSize
    int queueArr[];                                
    int front;
    int rear;
    int maxSize;
    //Constructor for first inisilize the instant variable
    DEQueueArrayOperation(int size){
        this.queueArr = new int[size];
        this.front = -1;
        this.rear = -1;
        this.maxSize = size;
    }

    //method for add from last elelment in the queue
    int enqueueAtLast(int data){
        if((front == 0 && rear == maxSize-1) || ((rear+1)%maxSize == front)){
            return -1;
        }
        if(front == -1){
            front = rear = 0;
        }else if(front != 0 && rear == maxSize-1){
            rear = 0;
        }else{
            rear++;
        }
        queueArr[rear] = data;
        return queueArr[rear];
    }

    //method for add from last elelment in the queue
    int enqueueAtFirst(int data){

        if((front == 0 && rear == maxSize-1) || ((rear+1)%maxSize == front)){
            return -1;
        }
        if(front == -1){
            front = rear = 0;
        }else if( front == 0){
            front = maxSize-1;
        }else{
            front--;
        }

        queueArr[front] = data;

        return queueArr[front];
    }

    //method for delete element from queue
    int dequeue(){
        if(front == -1){
            return -1;
        }
        int ret = queueArr[front];
        if(front == rear){
            front = rear = -1;
            return ret;
        }else if(front == maxSize-1 ){
            front = 0;
        }else{
            front++;
        }
        return ret;
    }
    //method for print the circular queue
    void printQueue(){
        if( front == -1){
            System.out.println("Queue is Empty");
            return;
        }
        if( front <= rear){
            // System.out.println("first" +front+" "+rear);
            System.out.print("[");
            for( int i = front; i <= rear; i++){
                System.out.print(" "+ queueArr[i]);
            }
            System.out.println("]");
        }else{
            System.out.println("second"+front+" "+rear);
            System.out.print("[");
            for(int i = front; i < maxSize; i++){
                System.out.print(" "+ queueArr[i]);
            }
            for( int i = 0; i <= rear; i++){
                System.out.print(" "+queueArr[i]);
            }
            System.out.println("]");
        }
    }
    
    //method for check emptyQueue
    boolean empty(){
        if(front == -1){
            return true;
        }else{
            return false;
        }
    }
    //method for check front of the Queue
    int front(){
        if( front == -1){
            return -1;
        }
        return queueArr[front];
    }
    //method for check rear 
    int rare(){
        
        if( rear == -1){
            return -1;
        }
        return queueArr[rear];
    }
}