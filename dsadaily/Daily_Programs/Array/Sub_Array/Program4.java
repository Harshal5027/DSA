package Daily_Programs.Array.Sub_Array;

public class Program4 {

    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3,1,3,4,6,4,6,3};
        
        int N=arr.length;
        int length=0;

        int maxValue=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;
        
        for(int i=0; i<N ; i++){
            if(minValue>arr[i]){
                minValue=arr[i];
            }
            if(maxValue<arr[i]){
                maxValue=arr[i];
            }
        } 

        int pos_min = -1, pos_max = -1, 
        ans = Integer.MAX_VALUE;

        for (int i = 0; i<N; i++) {

            if (arr[i] == minValue)
                pos_min = i;
    
            if (arr[i] == maxValue)
                pos_max = i;
    
            if (pos_max != -1 && pos_min != -1)
                ans = Math.min(ans, Math.abs(pos_min - pos_max) + 1);
        }
        System.out.println(ans);

    }
    
}
