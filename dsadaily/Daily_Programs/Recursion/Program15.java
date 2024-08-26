
//    Reverse String Program Using Substring

package Daily_Programs.Recursion;

public class Program15 {

    static String revString(String str){

        if(str==null || str.length()<=1){
            return str;
        }

        return revString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        
        String str = "Harshal";

        System.out.println("Reverse of the String is The "+revString(str));

    }
    
}
