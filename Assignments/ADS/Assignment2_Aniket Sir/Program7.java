/*Explanation: Take the number’s modulo by 10.
Multiply the reverse number by 10 and add modulo value into the reverse number.
Divide the number by 10.
Repeat above steps until number becomes zero.
*/
import java.util.Scanner;
class Program7
{
	static int reverse(int n)
	{
		int rev= 0;
		int rem;
		
		while(n>0)
		{
			rem= n%10;
			rev=(rev*10)+rem;
			n= n/10;
		}
		return rev;
	}
		
		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			int n= sc.nextInt();
			System.out.println(reverse(n));
		}
}

/*Output:
C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Javac Program7.java

C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Java Program7
3234
4323
*/
/*Time complexity:
O(log10n) 
	*/
	
