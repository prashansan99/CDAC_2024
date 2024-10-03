/*4) Write a Java program that merges two sorted lists of integers into a single sorted list.*/

import java.util.LinkedList;

public class Program4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		LinkedList<Integer> L1 = new LinkedList<>();
        L1.add(1);
        L1.add(3);
        L1.add(5);
        LinkedList<Integer> L2 = new LinkedList<>();
        L2.add(2);
        L2.add(4);
        L2.add(6);
        LinkedList<Integer> merged = new LinkedList<>();
        merged.addAll(L1);
        merged.addAll(L2);

		System.out.println("L1 : "+L1);
		System.out.println("L2 : "+L2);
		System.out.println("Merged : "+merged);
	}

}
/*Output:
L1 : [1, 3, 5]
L2 : [2, 4, 6]
Merged : [1, 3, 5, 2, 4, 6]
*/
