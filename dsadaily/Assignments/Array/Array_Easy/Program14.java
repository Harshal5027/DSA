package Assignments.Array.Array_Easy;

public class Program14 {

    static int findIntersection(int a[], int b[], int n, int m){

        int intersection = 0;
        for( int i = 0; i < n; i++){
            
            int count = 0;
            
            for( int j = 0; j < m; j++){

                if( a[i] == b[j]){
                    count++;
                }
            }

            if( count >= 1){
                intersection++;
            }
        }

        return intersection;
    }
    
    public static void main(String[] args) {
        
        int a[] = { 89, 24, 75, 11, 23 };

        int b[] = { 89, 2, 4};

        int n = a.length;
        int m = b.length;

        System.out.println( findIntersection( a, b, n, m ));
    }
}