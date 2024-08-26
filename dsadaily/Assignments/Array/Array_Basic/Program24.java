
//      Ceil The Floor

package Assignments.Array.Array_Basic;

public class Program24 {

    static void ceilAndFloor( int arr[], int X){

        int floor = -1;

        int ceil = -1;

        int ceilSub = Integer.MAX_VALUE;

        int floorSub = Integer.MAX_VALUE;

        for( int i = 0; i < arr.length; i++){


            if(arr[i] <= X && floorSub >= X - arr[i] ){

                floor = arr[i];   
                
                floorSub = X - arr[i];
            }

            if(arr[i] >= X && ceilSub >= arr[i] - X ){

                ceil = arr[i];     
                
                ceilSub = arr[i] - X;
            }
        }

        System.out.println(floor+ " "+ceil);
    }

    public static void main(String[] args) {
        
        int arr[] = {5, 6, 8, 9, 6, 5, 5, 6};

        int X = 10;

        ceilAndFloor(arr, X);
    }
    
}
