package Assignments.Array.Array_Basic;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15};
        
        // Assuming the values are in the range 0 to arr.length - 1
        countOccurrences(arr);
    }

    public static void countOccurrences(int[] arr) {
        // Step 1: Mark the occurrences
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1; // Get the index
            
            // Mark the number as seen by negating the value at that index
            if (index < arr.length && arr[index] > 0) {
                arr[index] = -arr[index];
            }
        }

        // Step 2: Count and print occurrences
        for (int i = 0; i < arr.length; i++) {
            // If the value at this index is negative, it means it was seen
            if (arr[i] < 0) {
                System.out.println("Number " + (i + 1) + " occurs " + -arr[i] + " times.");
                // Reset the value to positive for the next use
                arr[i] = -arr[i]; 
            }
        }
    }
}

