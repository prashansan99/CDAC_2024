import java.util.Scanner;
class Fibonacci
{
	static void Fibonacci(int n)
	{
		int num1= 0, num2= 1;
		for(int i= 0; i<n; i++)
		{
			System.out.print(num1+ " ");
			
			int num3= num2+ num1;
			num1= num2;
			num2= num3;
		}
	}
	
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		Fibonacci(n);
	}
}

/*Output:

C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Javac Fibonacci.java

C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Java Fibonacci
Enter the number:
3
0 1 1
C:\Users\PRASHANSA\OneDrive\Desktop\ADS\Assignments\Assignment_1>Java Fibonacci
Enter the number:
6
0 1 1 2 3 5

*/
		