import java.util.*;
class Array
{
private int[] a;
public Array() 
{
this(5);
}
public Array(int n)
{
	this.a=new int[n];
}

private static Scanner sc=new Scanner(System.in);
public void acceptRecord() 
{
for(int i=0;i<a.length;i++) 
{
	System.out.print("Enter  a["+i+"] ");
	this.a[i]=sc.nextInt();
}
}
public void printRecord()
{
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
private static void closeScanner() 
	{
	sc.close();
	}
}
class ArrayUtil
{
Array a1=new Array();
}
public class Program7
{
public static void main(String[] args) 
{
Array a=new Array();
a.acceptRecord();
a.printRecord();
}

}
/*Output:
Enter  a[0] 1
Enter  a[1] 2
Enter  a[2] 3
Enter  a[3] 4
Enter  a[4] 5
1 2 3 4 5 
*/