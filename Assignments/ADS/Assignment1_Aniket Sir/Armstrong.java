/*Explanation: In a mathematical number system, the Armstrong number is the number in any given number base, which makes the 
total of the same number when each of its digits is raised to the power of the total number of digits in the number. 
*/
import java.util.Scanner;

public class Armstrong
{
	//Function to calculate x raised to the power y
	int power(int x, long y)	
	{
		if(y==0)
			return 1;
		if(y%2==0)
			return power(x, y/2)* power(x, y/2);
		return x* power(x, y/2)* power(x, y/2);
	}
	
	//Function to calculate order of the number
	int order(int x)
	{
		int n= 0;
		while(x != 0)
		{
			n++;
			x= x/10;
		}
		return n;
	}
	
	boolean isArmstrong(int x)
	{
		//Calling order function
		
		int n= order(x);
		int temp= x, sum= 0;
		while(temp!=0)
		{
			int r= temp%10;
			sum= sum+power(r, n);
			temp= temp/10;
		}
		//If satisfies the Armstrong condition
		return (sum==x);
	}
	

	public static void main(String args[])
	{
		int x;
		Armstrong a= new Armstrong();
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		x= sc.nextInt();
		System.out.println(a.isArmstrong(x));
	
	}
}

/*Output:
Enter the number:
153
true

Enter the number:
123
false
*/ 
	
	
		
		
