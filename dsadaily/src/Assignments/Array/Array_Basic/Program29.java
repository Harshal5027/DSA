
//      Last index of one

package Assignments.Array.Array_Basic;

public class Program29 {

    static int lastIndexOfOne( String S ){

        int lastIndex = -1;
        for( int i = 0; i < S.length(); i++){

            if( S.charAt(i) == '1'){
                lastIndex = i;
            }
        }

        return lastIndex;
    }
    
    public static void main(String[] args) {
        
        String S = "00001";

        System.out.println(lastIndexOfOne( S ));


    }
}