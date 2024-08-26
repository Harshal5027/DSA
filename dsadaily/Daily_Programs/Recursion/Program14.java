package Daily_Programs.Recursion;

public class Program14 {

    static String reverse(String str, int range){

        if(range==str.length()-1){
            return ""+str.charAt(range);
        }

        return reverse(str, range+1)+str.charAt(range);

    }
 
    public static void main(String[] args) {
        
        String str = "Vivek";

        System.out.println(reverse(str,0));

    }

}