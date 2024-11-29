
//  Binary tree implementation using linkedlist and recurssion

package Daily_Programs.Trees;

import java.util.Scanner;

class Node{

    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class BinaryTree{

    //method for binary tree construction
    Node constructBinaryTree(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a data : ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        System.out.println("Do you want to add data on left side of : "+ newNode.data);

        char leftNode = sc.next().charAt(0);

        if( leftNode == 'Y'|| leftNode=='y'){
            newNode.left = constructBinaryTree();           // this will add the address of left node in left
        }

        System.out.println("Do you want to add data on right side of : "+ newNode.data);

        char rightNode = sc.next().charAt(0);

        if( rightNode == 'Y'|| rightNode=='y'){
            newNode.right = constructBinaryTree();          // this will add the address of the rightside node in right
        }

        return newNode;
    }

    //method for print the Pre-order tree traversal
    void printPreOrderBinaryTree(Node newNode){

        if( newNode == null){
            return;
        }

        System.out.print(newNode.data + " ");

        printPreOrderBinaryTree(newNode.left);

        printPreOrderBinaryTree(newNode.right);
    }

    //method for print the In-Order tree Traversal
    void printInOrderBinaryTree(Node newNode){

        if(newNode == null){
            return;
        }

        printInOrderBinaryTree(newNode.left);
        System.out.print(newNode.data + " ");
        printInOrderBinaryTree(newNode.right);
    }

    //method for print Post-order tree Traversal
    void printPostOrderBinaryTree( Node newNode){

        if( newNode == null){
            return;
        }

        printPostOrderBinaryTree(newNode.left);
        printPostOrderBinaryTree(newNode.right);
        System.out.print(newNode.data + " ");
    }

}
public class Program1 {

    public static void main(String[] args) {
        
        BinaryTree BT = new BinaryTree();

        System.out.println("First construct the tree");
        Node root = null;

        root = BT.constructBinaryTree();

        System.out.println("Pre-Order tree Traversal");
        BT.printPreOrderBinaryTree(root);

        System.out.println();
        System.out.println("In-Order tree Traversal");
        BT.printInOrderBinaryTree(root);

        System.out.println();
        System.out.println("Post-Order tree Traversal");
        BT.printPostOrderBinaryTree(root);
    }
}