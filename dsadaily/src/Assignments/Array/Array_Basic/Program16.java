
// Last index of one---------------

package Assignments.Array.Array_Basic;

public class Program16 {

    static int lastIndex( String S ){

        int index = -1;

        for( int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '1'){
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        
        String S = "0000";

        System.out.println("Last index of one is : "+lastIndex(S));
    }
    
}
