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
		
			