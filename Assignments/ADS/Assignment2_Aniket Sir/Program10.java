/*Explnation: In each iteration, shift the elements by one position to the left in a circular fashion (the first element becomes the last).
  Perform this operation d times to rotate the elements to the left by d positions.
// Java Program to left rotate the array by d positions
// by rotating one element at a time

import java.util.Arrays;

class Program10 {
    
    // Function to left rotate array by d positions
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
  
        // Repeat the rotation d times
        for (int i = 0; i < d; i++) {
          
            // Left rotate the array by one position
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
/*Output: 3 4 5 6 1 2 
  */
/*Time complexity: O(n*d)
  */
