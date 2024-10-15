/*Explanation: used 2 for loops, One for the rows and other for the columns and printed stars according to the pattern.
*/
import java.util.Scanner;

class Program1
{
	public static void main(String args[])
	{
		int n;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		for(int i= 0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}

/*Output:
C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Javac Program1.java

C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Java Program1
5
*
**
***
****
*****
*/
/*Time complexity: O(N^2)
*/
		
		
