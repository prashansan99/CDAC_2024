import java.util.Arrays;

public class Program4
{
	public static int removeDuplicates(int[] a)
	{
		int i=0;
		for(int j=1;j<a.length;j++) 
		{
			if(a[i]!=a[j]) 
			{
				i++;
				a[i]=a[j];
			}
		}
		return i+1;
}
	public static void main(String[] args) 
	{
		int[] a= {2,2,3,3,1,6,5,5,4,4,4,4, 7, 7, 8, 1,6};
		System.out.println("array before removing duplicates "+Arrays.toString(a));
		Arrays.sort(a);
		int k=removeDuplicates(a);
		System.out.print("array after removing duplicates ");
		for(int i=0;i<k;i++) 
		{
		System.out.print(a[i]+" ");
		}
	}
}
/*Output:
array before removing duplicates [2, 2, 3, 3, 1, 6, 5, 5, 4, 4, 4, 4, 7, 7, 8, 1, 6]
array after removing duplicates 1 2 3 4 5 6 7 8 
*/