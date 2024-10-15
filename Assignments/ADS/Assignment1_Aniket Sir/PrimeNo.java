/*Explanation: If n is less than 2, return false (0 and 1 are not prime).
Loop through numbers from 2 to n-1.
If n is divisible by any of these numbers, return false.
If no divisors are found, return true.
*/
import java.util.Scanner;
class PrimeNo
{
	static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		
		for(int i= 2; i<n; i++)
			if(n%i==0)
					return false;
				return true;
	}
	
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		
		if(isPrime(num))
			System.out.println("true");
		else
			System.out.println("false");
	}
}

/*Output:

C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Javac PrimeNo.java

C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Java PrimeNo
Enter the number:
23
true

C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Java PrimeNo
Enter the number:
2
true

C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Java PrimeNo
Enter the number:
4
false


*/
/*Time complexity:
 O(n)
*/
		
			
