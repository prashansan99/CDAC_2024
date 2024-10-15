/*Explanation: A leap year is a year that contains an additional day, February 29th, making it 366 days long instead of the usual 365 days. 
Leap years are necessary to keep our calendar in alignment with the Earth’s revolutions around the Sun.
A year is a leap year if “any one of ” the following conditions are satisfied: 
The year is multiple of 400.
The year is a multiple of 4 and not a multiple of 100.
*/
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
/*Time Complexity:  O(1)
	*/




