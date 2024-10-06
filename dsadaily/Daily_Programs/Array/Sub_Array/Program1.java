package Daily_Programs.Array.Sub_Array;

public class Program1 {
    
    public static void main(String[] args){

        char arr[]=new char[]{'a','b','e','g','a','g'};

        int N=arr.length;
        int countt=0;
        int acount=0;
        for(int i=0; i<N; i++){
            if(arr[i]=='a'){
                acount++;
            }else if(arr[i]=='g'){
                countt=countt+acount;
            }
        }
        System.out.println(countt);
    }
    
}
