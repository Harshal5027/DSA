
//      Leaders In the Array

package Assignments.Array.Array_Easy;

public class Program26 {

    static void leadersInArray( int arr[], int N, int leader){

        if( N == 0)
            return;

        if(arr[N-1] >  leader)
            leader = arr[N-1];

        leadersInArray(arr, N-1, leader);

        if( arr[N-1] == leader)
            System.out.println(leader);

    }

    public static void main(String[] args) {
        
        int arr[] = {16, 17, 4, 3, 5, 2};

        int N = arr.length;

        int leader = Integer.MIN_VALUE;

        leadersInArray( arr, N, leader);
    }
    
}
