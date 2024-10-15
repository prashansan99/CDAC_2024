/*Explanation:
Create a temporary array temp[] to store unique elements.
Sort the input array first then traverse input array and copy all the unique elements of a[] to temp[]. Also, keep count of unique elements. Let this count be j.
Copy j elements from temp[] to a[].
*/
import java.util.*;
public class Program2
{
	static int removeDuplicates(int[] arr)
	{
		int n= arr.length;
		if(n<=1)
			return n;
		
		int index= 1;	//Starting from the second element
		for(int i= 1; i<n; i++)
		{
			if(arr[i] != arr[i-1])
			{
				arr[index++]= arr[i];
			}
		}
		return index;
	}
	
	public static void main(String args[])
	{
		int arr[]= new int[10];
		int count= 0;
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= sc.nextInt();
		}
		int newSize= removeDuplicates(arr);
		
		for(int i= 0; i<newSize-1; i++)
		{
			System.out.print(arr[i]+ " ");
			count++;
		}
		System.out.println();
		System.out.print(count);
	}
}

/*Output:
C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Javac Program2.java

C:\Users\PRASHANSA\OneDrive\Desktop\ADS Notes\Assignment_Solutions\Assignment_2>Java Program2
1 2 3 3 4 4 5 5 6 5
1 2 3 4 5 6
6
*/
/*Time Complexity:
 O(nlogn)
	 */
