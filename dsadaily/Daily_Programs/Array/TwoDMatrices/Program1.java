
//--------------------- Square matrix to transpoe matrix----------------------------

package Daily_Programs.TwoDMatrices;

public class Program1 {

    public static void main(String[] args) {
        
        int arr[][]=new int[5][5];

        arr[0]=new int[]{1,2,3,4,5};
        arr[1]=new int[]{6,7,8,9,10};
        arr[2]=new int[]{11,12,13,14,15};
        arr[3]=new int[]{16,17,18,19,20};
        arr[4]=new int[]{21,22,23,24,25};

        // int transpose[][]=new int[5][5];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
        // for(int i=0; i<arr.length; i++){
        //     int k=arr.length-1;
        //     for(int j=0; j<arr.length/2; j++){
        //         int temp=arr[i][j];
        //         arr[i][j]=arr[i][k];
        //         arr[i][k]=temp;
        //         k--;
        //     }
        // }

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}