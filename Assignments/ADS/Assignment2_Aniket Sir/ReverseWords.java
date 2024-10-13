import java.util.*;
import java.io.*;
public class ReverseWords
{
	static String reverse( String s)
	{
		String s1= "";
		int index= s.length()-1;
		int strLength= s.length();
		for(int i= strLength-1; i>=0; i--)
		{
			//s1+= s.charAt(i);
			s1= s1+ s.charAt(index--);
		}
		
		return s1;
				
	}
	
	public static void main(String args[])
	{
		String str;
		System.out.println("Enter the String: ");
		Scanner sc= new Scanner(System.in);
		str= sc.nextLine();
		System.out.print("Reversed string is: "+ reverse(str));
		;
	}
}
		
		
