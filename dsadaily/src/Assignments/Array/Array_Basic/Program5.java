
//--------------------------- Replace all 0 with 5's----------------------------------

package Assignments.Array_Basic;

public class Program5 {

    public static void main(String[] args) {
        int N=1004; 
        int i=N;
        int sum=0;
        int count=1;

        while(i>0){
            int rem=i%10;
            if( rem==0){
                sum=sum+5*count;
            }else{
                sum=sum+rem*count;
            }
            count=count*10;
            i=i/10;
        }

        System.out.println(sum);
        
    }
    
}
