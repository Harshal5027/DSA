package Daily_Programs.Queues.Queue;
import java.util.*;
public class Queue1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size for Queue : ");
        int size = sc.nextInt();
        QueueArrayOperation q = new QueueArrayOperation(size);

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

class  QueueArrayOperation {

    //instant variable for array, front, rear, maxSize
    int queueArr[];                                
    int front;
    int rear;
    int maxSize;

    //Constructor for first inisilize the instant variable
    QueueArrayOperation(int size){
        this.queueArr = new int[size];
        this.front = -1;
        this.rear = -1;
        this.maxSize = size;
    }

    //methode for the add the element in the queue
    int enqueue(int element){
        if( front == -1){
            front = rear = 0;
            queueArr[rear] = element;
            return element;
        }
        if( rear == maxSize-1){
            return -1;
        }else{
            rear++;
            queueArr[rear] = element;
            return element;
        }
    }

    //method for delete element from queue
    int dequeue(){

        if(front == -1 ){
            return -1;
        }
        
        int element = queueArr[front];
        front++;

        if( front > rear ){
            front = rear = -1;
        }

        return element;
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

    //method for print the Queue
    void printQueue(){

        if( front == -1){
            System.out.println("Queue is Empty");
        }
        System.out.print("[");
        for( int i = front; i <= rear; i++){
            System.out.print(" "+queueArr[i]);
        }
        System.out.println("]");
    }
}