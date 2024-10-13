import java.util.Scanner;
public class GCD
{
	static int gcd(int a, int b)
	{
		int result= Math.min(a, b);
		while(result>0)
		{
			if(a%result ==0 && b%result ==0)
			{
				break;
			}
			result--;
		}
	return result;
	}

public static void main(String args[])
{
	int num1, num2;
	System.out.print("Enter num1: ");
	Scanner sc= new Scanner(System.in);
	num1= sc.nextInt();
	System.out.print("Enter num2: ");
	num2= sc.nextInt();
	
	System.out.println("GCD of" + num1 + " and " + num2 + " is " +gcd(num1, num2));
}}

/*Output:

C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Javac GCD.java

C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Java GCD
Enter num1: 68
Enter num2: 89
GCD of68 and 89 is 1

C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Java GCD
Enter num1: 98
Enter num2: 56
GCD of98 and 56 is 14
*/
	
	