package Daily_Programs.Sub_Array;

public class Program3 {

    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,1,3,4,6,4,6,3};

        int N=arr.length;
        int length=0;
        int minLength=Integer.MAX_VALUE;

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
        for(int i=0; i<N; i++){
            if(arr[i]==minValue){
                for(int j=i+1;j<N;j++){
                    if(arr[j]==maxValue){
                        length=j-i+1;
                        if(minLength>length){
                            minLength=length;
                        }
                    }
                }
            }else if(arr[i]==maxValue){
                for(int j=i+1;j<N;j++){
                    if(arr[j]==minValue){
                        length=j-i+1;
                        if(minLength>length){
                            minLength=length;
                        }
                    }
                }
            }
        }
        System.out.println(minLength);
    }
    
}