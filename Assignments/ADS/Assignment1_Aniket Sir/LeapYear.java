import java.util.*;

public class LeapYear
{
	static boolean isLeapyear(int year)
	{
		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         return true;
      else
         return false;
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the year: ");
		Scanner sc= new Scanner(System.in);
		
		int y= sc.nextInt();
		
		System.out.println(isLeapyear(y));
	}
}
		