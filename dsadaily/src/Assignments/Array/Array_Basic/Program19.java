
//   Find the common element in three sorted Array

package Assignments.Array.Array_Basic;

public class Program19 {

    static void commonElement( int arr1[], int arr2[], int arr3[]){

        for(int i = 0; i < arr1.length; i++){

            for( int j = 0; j < arr2.length; j++){

                if(arr1[i]==arr2[j]){
                    
                    for( int k = 0; k < arr3.length; k++){

                        if(arr2[j]==arr3[k]){

                            System.out.println(arr1[i]);
                            
                        }

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int arr1[] = {1, 5, 10, 20, 40, 80};

        int arr2[] = {6, 7, 20, 80, 100};

        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        commonElement(arr1, arr2, arr3);
    }
    
}