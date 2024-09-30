import java.util.*;
class Array1
{
	int[] a;

public Array1() 
{
	this(5);	
}
public Array1(int n) 
{
	this.a=new int[n];
}
public int getElement(int ind)
{
	if(ind>=0&&ind<a.length) 
	{
		return a[ind];
	}
	else
	{
		throw new ArrayIndexOutOfBoundsException("Index "+ind+" is out of bounds");
	}
	
	}
public void setElement(int ind,int v) 
{
if(ind>=0&&ind<a.length)
	{
	a[ind] = v;
    } 
else 
	{
	throw new ArrayIndexOutOfBoundsException("Index " +ind+" is out of bounds");
	}
}

private static Scanner sc=new Scanner(System.in);
public void acceptElement()
{
for(int i=0;i<a.length;i++)
{
System.out.print("enter "+i+" index element");
int v=sc.nextInt();
setElement(i,v);
}
}
public void printElement() 
{
for(int i=0;i<a.length;i++) 
	{
	System.out.println(getElement(i));
	}
	
}
private static void closeScanner() 
{
	sc.close();
}
public static int menuList(Scanner sc)
{
System.out.println("Select a given option");
System.out.println("0.Exit");
System.out.println("1.Accept array elements");
System.out.println("2.Print array elements");
	int choice=sc.nextInt()	;
	return choice;
	
}

}
public class Program8 
{
public static void main(String[] args) 
{
Array a1=new Array();
Scanner sc=new Scanner(System.in);
int choice;	
while((choice=Array1.menuList(sc))!=0) 
{
switch(choice)
{
case 1:
	a1.acceptRecord();
	break;
case 2:
	a1.printRecord();
	System.out.println();
	break;
default:System.out.println("Exiting menu list");
	break;
}	
}

	}
}
/*Output:
Select a given option
0.Exit
1.Accept array elements
2.Print array elements
1
Enter  a[0] 1
Enter  a[1] 1
Enter  a[2] 2
Enter  a[3] 3
Enter  a[4] 4
Select a given option
0.Exit
1.Accept array elements
2.Print array elements
2
1 1 2 3 4 
Select a given option
0.Exit
1.Accept array elements
2.Print array elements
*/