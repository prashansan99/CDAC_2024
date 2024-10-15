/*Explanation:
Initialize reversed_number = 0
Loop while number > 0
Multiply reversed_number by 10 and add number  % 10 to reversed_number
reversed_number  = reversed_number*10 + number %10;
Divide the number by 10
Return reversed_number
*/
import java.util.*;

class NumbPalindrome {
    // Iterative function to
    // reverse the digits of number
    static int reversNumber(int n)
    {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }
 
    // Main function
    public static void main(String[] args)
    {
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
	
        int reverseN = reversNumber(n);
        System.out.println("Reverse of n = " + reverseN);
 
        // Checking if n is same
        // as reverse of n
        if (n == reverseN)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
/*Output:
121
true
*/
/*Time complexity: O(log10 N)
	*/
