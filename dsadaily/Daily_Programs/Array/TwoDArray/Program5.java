package Daily_Programs.TwoDArray;

public class Program5 {

    public static void main(String[] args) {
        
        int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int N=arr.length;

        for(int i=0; i<N; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
    
}
