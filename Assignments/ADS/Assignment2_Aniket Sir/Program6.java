import java.util.*;
class Program6
{
	public static String reverse(String s)
	{
		StringBuilder sb= new StringBuilder();
		String temp= "";
		for(int i=0; i<s.length();i++)
		{
			char ch= s.charAt(i);
			if(ch==' ')
			{
				if(!temp.equals(""))
				{
					sb.insert(0,temp+" ");
				}
				temp= "";
			}
			else
				temp += ch;
		}
		return sb.toString().substring(0,sb.length()-1); 
	}
	
	public static void main(String args[])
	{
		String s1;
		Scanner sc= new Scanner(System.in);
		s1= sc.nextLine();
		String ans= reverse(s1);
		System.out.println(ans);
	}
}
		
		
		
		

