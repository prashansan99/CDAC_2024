/*Explanation:
Step 1: Start
Step 2: Read the input number from the user
Step 2: Declare and initialize variables fact = 1 and i =  1
Step 4:  Repeat the loop until  i<=num
–  fact = fact * i
–  i =  i++
Step 5:  Print fact to get the factorial of a given number
Step 6: Stop
*/
import java.util.Scanner;
class Factorial
{
	static int factorial(int n)
	{
		int res= 1, i;
		for(i= 2; i<= n; i++)
			res= res*i;
		return res;
	}
	
	public static void main(String args[])
	{
		int num;
		System.out.print("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		System.out.println("Factorial of "+ num + " is " +factorial(5));
	}
}



/*Output: 
C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Javac Factorial.java

C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Java Factorial
Enter the number:
4
Factorial of 4 is 120
*/

/*Time complexity: O(n)
*/
		
