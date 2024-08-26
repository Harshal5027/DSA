
//      Print an array in pendulum arrangement

package Assignments.Array.Array_Basic;

public class Program34 {

    static void pendulumArrange( int arr[] , int N){

        int num1 = -1;

        int num2 = 1;

        int newarr[] = new int[arr.length];

        for( int i = 0; i < N; i++ ){

            for( int j = i; j < N; j++){

                if(arr[j] <= arr[i] ){

                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }
            }
        }
        for( int i = 0; i < N; i++){

            if( i == 0){
                newarr[N/2] = arr[i];
            }else if( i % 2 == 0){

                newarr[N/2 + num1] = arr[i];

                num1--;

            }else if(i % 2 !=0){

                newarr[N/2 + num2] = arr[i];

                num2++;
            }

        }

        for( int i = 0; i < newarr.length; i++ ){
            System.out.println(newarr[i]);
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 3, 2, 5, 4};

        pendulumArrange( arr , arr.length);
    }
    
}
