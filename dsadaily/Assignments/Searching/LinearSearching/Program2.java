
//   return the index of the perticular element in the array

package Assignments.Searching.LinearSearching;

public class Program2 {

    static int findIndex(int arr[],int num){

        for(int i = 0; i<arr.length; i++){

            if(num == arr[i]){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{10, 20, 30, 40, 50, 60};

        int num = 60;

        int retVal = findIndex(arr, 60 );

        if(retVal == -1){
            System.out.println("Given element "+ num +" is not present in the array");
        }else{
            System.out.println("Given element " + num + " is present in the array at the index "+retVal);
        }
    }
    
}
