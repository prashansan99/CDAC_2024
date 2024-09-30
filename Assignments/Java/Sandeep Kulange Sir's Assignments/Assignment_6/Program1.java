import java.util.*;
public class Program1 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int[] a=new int[5];
		for(int i=0;i<a.length;i++)
			{
			System.out.println(a[i]+"\t");
			}
		for(int i=0;i<a.length;i++) 
		{
			if(i==1) System.out.print("Enter "+i+"st value: ");
			else if(i==2) System.out.print("Enter "+i+"nd value: ");
			else if(i==3) System.out.print("Enter "+i+"rd value: ");
			else System.out.print("Enter "+i+"th value: ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}

}
/*Output:
0	
0	
0	
0	
0	
Enter 0th value: 2
Enter 1st value: 3
Enter 2nd value: 4
Enter 3rd value: 5
Enter 4th value: 6
2  3  4  5  6 
*/