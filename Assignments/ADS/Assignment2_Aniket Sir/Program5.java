/*Explanation:  we reverse the original array itself. In this method, we swap the elements of the array. The first element is swapped with the last element. The second element is swapped with the last but one element and so on. 
For instance, consider array [1, 2, 3, …., n-2, n-1, n]. We swap 1 with n, 2 with n-1, 3 with n-2 and further. 
	*/
import java.util.Scanner;
class Program5
{
	public static void main(String args[])
	{
		int arr[]= new int[10];
		Scanner sc= new Scanner(System.in);
		for(int i= 0; i<arr.length; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int n= arr.length;
		int start= 0, end= n-1;
		while(start<end)
		{
			int temp= arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
/*Output: 12345
	54321
	*/
/*Time complexity: O(n)
	*/
