package Daily_Programs.Sub_Array;

public class Program2 {

    public static void main(String[] args){

        char arr[]=new char[]{'a','b','e','g','a','g'};

        int N=arr.length;
        int count=0;

        for(int i=0; i<N; i++){
            if(arr[i]=='a'){
                for(int j=i+1; j<N; j++){
                    if(arr[j]=='g'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
