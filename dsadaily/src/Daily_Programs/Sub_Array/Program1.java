package Daily_Programs.Sub_Array;

public class Program1 {
    
    public static void main(String[] args){

        char arr[]=new char[]{'a','b','e','g','a','g'};

        int N=arr.length;
        int count=0;
        int acount=0;
        for(int i=0; i<N; i++){
            if(arr[i]=='a'){
                acount++;
            }else if(arr[i]=='g'){
                count=count+acount;
            }
        }
        System.out.println(count);
    }
    
}
