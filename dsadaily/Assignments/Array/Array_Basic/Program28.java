
//      Remove Duplicate from unsorted Array

package Assignments.Array.Array_Basic;

public class Program28 {

    static void removeDuplicate( int N, int arr[]){

        int M = 0;
        int newarr[] = new int[N];

        for( int i = 0; i < N; i++){

            int count = 0;

            for( int j = 0; j <= i; j++){

                if( arr[i] == arr[j]){
                    count++;
                }
            }
            if( count == 1){

                newarr[M] = arr[i];
                M++;

            }
        }

        for( int i = 0; i < M; i++){

            System.out.println(newarr[i]);
        }
    }

    public static void main(String[] args) {
        
        int N = 6;

        int arr[] = { 1, 2, 3, 1, 4, 2};

        removeDuplicate(N , arr);
    }
    
}