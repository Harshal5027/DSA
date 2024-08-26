
// clockwise fashion

package Daily_Programs.TwoDMatrices;

public class Program3 {

    public static void main(String[] args) {
        
        int arr[][]=new int[5][5];

        arr[0]=new int[]{1,2,3,4,5};
        arr[1]=new int[]{6,7,8,9,10};
        arr[2]=new int[]{11,12,13,14,15};
        arr[3]=new int[]{16,17,18,19,20};
        arr[4]=new int[]{21,22,23,24,25};

        int N=arr.length;
        int i=0; 
        int j=0;

        for( int k=0 ; k<N-1; k++){
            System.out.println( arr[i][j] );
            j++;
        }

        for(int k=0; k<N-1; k++){
            System.out.println(arr[i][j]);
            i++;
        }

        for( int k=0 ; k<N-1; k++){
            System.out.println( arr[i][j] );
            j--;
        }

        for(int k=0; k<N-1; k++){
            System.out.println(arr[i][j]);
            i--;
        }
        

    }

}
