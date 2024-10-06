// package Daily_Programs.LinkedList;

// import java.util.Scanner;

// public class FasterAndSlowerPointer {

//     class Node{

//         int data;
//         Node next = null;

//         Node(int data){
//             this.data = data;
//         }
//     }

//     Node head = null;
//     void addFirst(int data){

//         Node newNode = new Node(data);

//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     // int countNode(){
//     //     int count = 0;
//     //     Node temp = head;

//     //     while(temp != null){
//     //         count++;
//     //         temp = temp.next;
//     //     }
//     //     return count;
//     // }

//     int middleElement(){

//         if( head == null ){
//             System.out.println("LinkedList is Empty!!!");
//             return -1;
//         }
        
//         Node slower = head;
//         Node faster = head.next;

//         while (faster != null) {

//             slower = slower.next;
//             faster = faster.next;

//             if( faster != null)
//                 faster = faster.next;
//         }
//         return slower.data;
//     }
//     void printSll(){

//         Node temp = head;
//         System.out.print("[");
//         while( temp != null){

//             System.out.print(temp.data+" ");
//             temp = temp.next;
            
//         }
//         System.out.println("]");
//     }  
// }

// class Client{

//     public static void main(String[] args) {

//         FasterAndSlowerPointer element = new FasterAndSlowerPointer();
        
//         Scanner sc = new Scanner(System.in);

//         char ch;

//         do {
            
//             System.out.println("1.Add element");
//             System.out.println("2.Find Middle element");
//             System.out.println("3.PrintLinkedList");
//             System.out.print("\nSelect the Choise : ");

//             int choise = sc.nextInt();

//             switch (choise) {
//                 case 1:
//                     System.out.print("Enter a element : ");
//                     element.addFirst(sc.nextInt());
//                     break;

//                 case 2 :
//                     int val = element.middleElement();
//                     if(val != -1)
//                         System.out.println("Middle Element of the LinkedList is : "+ val);

//                     break;

//                 case 3: 
//                     element.printSll();
//                     break;
            
//                 default:
//                     System.out.println("Invalid choise");
//                     break;
//             }
//             System.out.print("Do you want you continue : ");
//             ch = sc.next().charAt(0);

//         } while (ch == 'y' || ch =='Y');

//         sc.close();
//     }
// }