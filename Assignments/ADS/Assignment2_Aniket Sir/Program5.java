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