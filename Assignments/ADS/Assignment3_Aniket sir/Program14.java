/*Explanation: We define a variable minEle that stores the current minimum element in the stack. Now the interesting part is, how to handle the case when the minimum element is removed. To handle this, we push “2x – minEle” into the stack instead of x so that the previous
 minimum element can be retrieved using the current minEle and its value stored in the stack
*/
import java.util.*;


class MyStack {
	Stack<Integer> s;
	Integer minEle;

	// Constructor
	MyStack() { s = new Stack<Integer>(); }

	// Prints minimum element of MyStack
	void getMin()
	{
		
		if (s.isEmpty())
			System.out.println("Stack is empty");

	
		else
			System.out.println("Minimum Element in the "
							+ " stack is: " + minEle);
	}

	
	void peek()
	{
		if (s.isEmpty()) {
			System.out.println("Stack is empty ");
			return;
		}

		Integer t = s.peek(); // Top element.

		System.out.print("Top Most Element is: ");

		if (t < minEle)
			System.out.println(minEle);
		else
			System.out.println(t);
	}

	
	void pop()
	{
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}

		System.out.print("Top Most Element Removed: ");
		Integer t = s.pop();

		
		if (t < minEle) {
			System.out.println(minEle);
			minEle = 2 * minEle - t;
		}

		else
			System.out.println(t);
	}

	
	void push(Integer x)
	{
		if (s.isEmpty()) {
			minEle = x;
			s.push(x);
			System.out.println("Number Inserted: " + x);
			return;
		}

		
		if (x < minEle) {
			s.push(2 * x - minEle);
			minEle = x;
		}

		else
			s.push(x);

		System.out.println("Number Inserted: " + x);
	}
};

public class Program14 {
	public static void main(String[] args)
	{
		MyStack s = new MyStack();
	
		// Function calls
		s.push(3);
		s.push(5);
		s.getMin();
		s.push(2);
		s.push(1);
		s.getMin();
		s.pop();
		s.getMin();
		s.pop();
		s.peek();
	}
}
/*Output:
Number Inserted: 3
Number Inserted: 5
Minimum Element in the stack is: 3
Number Inserted: 2
Number Inserted: 1
Minimum Element in the stack is: 1
Top Most Element Removed: 1
Minimum Element in the stack is: 2
Top Most Element Removed: 2
Top Most Element is: 5

*/

/*Time Complexity: O(1)
*/
