package Assignments.Searching.LinearSearching;

import java.util.*;

public class Program1 {

    static void operationOnarray(int arr[]){

        for(int i=0; i<arr.length; i++){

            arr[i] += 5; 
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];

        System.out.println("Enter Elements in the array");

        for(int i = 0; i<arr.length; i++){

            arr[i] = sc.nextInt();
        }

        operationOnarray(arr);


        System.out.println("After Operation");
        
        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }
    }
    
}
