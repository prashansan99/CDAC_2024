/* Java program to reverse
String using Stack */
/*Explanation: Create an empty stack.
One by one push all characters of string to stack.
One by one pop all characters from stack and put them back to string.
*/

import java.util.*;

// stack
class Stack {
	int size;
	int top;
	char[] a;

	
	boolean isEmpty() { return (top < 0); }

	Stack(int n)
	{
		top = -1;
		size = n;
		a = new char[size];
	}

	
	boolean push(char x)
	{
		if (top >= size) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			return true;
		}
	}

	char pop()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			char x = a[top--];
			return x;
		}
	}
}

// Driver code
class Program3{
	// function to reverse the string
	public static void reverse(StringBuffer str)
	{
		// Create a stack of capacity
		// equal to length of string
		int n = str.length();
		Stack obj = new Stack(n);

		// Push all characters of string
		// to stack
		int i;
		for (i = 0; i < n; i++)
			obj.push(str.charAt(i));

		// Pop all characters of string
		// and put them back to str
		for (i = 0; i < n; i++) {
			char ch = obj.pop();
			str.setCharAt(i, ch);
		}
	}

	
	public static void main(String args[])
	{
		
		StringBuffer s = new StringBuffer("hello");

		
		reverse(s);

		// print the reversed string
		System.out.println(s);
	}
}

/*Output:
hello
olleh
*/
/*Time complexity:  O(N)
*/
