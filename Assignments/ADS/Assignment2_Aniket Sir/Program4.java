import java.util.Scanner;
class Program4
{
	public static void main(String args[])
	{
		String str2= "";
		Scanner sc= new Scanner(System.in);
		
		String str1= sc.nextLine();
		
		for(int i=str1.length()-1; i>=0; i--)
		{
			char ch= str1.charAt(i);
			str2= str2+ch;
		}
		System.out.println(str2);
	}
}

/*Output:

C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Javac Program4.java

C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Java Program4
Prashansa
asnahsarP

*/
