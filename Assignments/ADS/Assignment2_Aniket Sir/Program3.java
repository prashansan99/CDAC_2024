/*Explanation: 1) Iterate through all characters of given string, do following
   a) If current character is a space, then move all subsequent
      characters one position back and decrease length of the 
      result string.
*/
import java.util.Scanner;
class Program3
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	String str= sc.nextLine();
	String result= "";
	for(int i=0; i<str.length(); i++)
	{
		char ch= str.charAt(i);
		
		if(!Character.isWhitespace(ch))
		{
			result= result+ch;
		}
	}
	System.out.println(result);
	}
	
		
}

/*Output:
C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Javac Program3.java

C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Java Program3
Java Programming
JavaProgramming
*/
/*Time complexity:  O(n2).
	*/
