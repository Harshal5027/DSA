
//      Maximum repetating numberr.................

package Assignments.Array.Array_Basic;

import java.util.*;

public class Program14 {

    static void repeatingNumber(int N, int K, int arr[]){

        int maxCount = 0;

        int maxElement = 0;

        for( int i = 0; i < N; i++){

            int count = 0;

            for( int j = 0; j< N; j++){

                if( arr[i] == arr[j]){
                    count++;
                }


            }
            if(count > maxCount){
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("In the array the element "+ maxElement +" comes for "+maxCount+" times");


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of the Array");

        int N = sc.nextInt();

        System.out.println("Eneter the element range");

        int K = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter a elements in the Array : ");

        for( int i = 0; i < N; i++){

            arr[i] = sc.nextInt();
        }

        repeatingNumber(N, K, arr);

    }   
}