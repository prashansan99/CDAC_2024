import java.util.Scanner;
class Program9
{
	public static boolean isPalindrome(String str)
	{
		String rev= "";
		
		boolean ans= false;
		
		for(int i= str.length()-1; i>=0; i--)
		{
			rev= rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			ans= true;
		}
		return ans;
	}
	
	public static void main(String args[])
	{
		String s1;
		Scanner sc= new Scanner(System.in);
		s1= sc.nextLine();
		s1= s1.toLowerCase();
		boolean ans1= isPalindrome(s1);
		System.out.println(ans1);
	}
		
}
/*Output:

C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Javac Program9.java

C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Java Program9
Madam
true

C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Java Program9
Prashansa
false
*/