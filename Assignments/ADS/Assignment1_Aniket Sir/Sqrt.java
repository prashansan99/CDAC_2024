/*Explantion: Used the sqrt() function for getting the square root of the number.
*/
import java.util.Scanner;
import java.lang.Math;


/*public class Sqrt
{
	static int result;
	 static int squareRoot(int n)
	{
		if(n==1)
			return n;
		result= (int) Math.sqrt(n);
		return result;
		
	}
	
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		
		System.out.println("Square root of a number: "+ squareRoot(n));
	}
}

*/

class Sqrt
{
	int result;
	static int squareRoot(int n)
	{
		if(n==0||n==1)
			return n;
		
		int i= 1, result= 1;
		while(result<=n)
		{
			i++;
		result= i*i;
		}
	return i-1;
	}
	
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		
		System.out.println("Square root of a number: "+squareRoot(num));
	}
}
/*Output: 
Enter the number: 4
Square root of a number: 2
	*/
/*Time complexity: O(logN)
	*/
		
		
		
		
