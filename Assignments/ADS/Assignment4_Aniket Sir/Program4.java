/*Explanation: The idea behind this approach is we will take one extra node in the new list which is the Head node of the list.
We will take one variable of the type list which is always at the last node of the list so that the appending of a new node becomes easier.
We will iterate the loop and check for the smaller element from both lists and append that node to the resultant list.
If we reached the end of any list then we will simply append the remaining nodes from the second list.
*/


import java.io.*;

public class ListNode {

	int val;
	ListNode next;

	ListNode() {}
	ListNode(int val) { this.val = val; }

	ListNode(int val, ListNode next)
	{
		this.val = val;
		this.next = next;
	}
}

class Program4 {
	public static ListNode mergeTwoLists(ListNode l1,
										ListNode l2)
	{
		// New List
		ListNode result = new ListNode(-1);

		// variable to point the last node of the list.
		ListNode p = result;

		// Iterate the loop
		while (l1 != null && l2 != null) {
			// Find the smaller element and append it to the
			// list.
			if (l1.val <= l2.val) {
				p.next = l1;
				l1 = l1.next;
			}

			else {
				p.next = l2;
				l2 = l2.next;
			}

			// Update the variable
			p = p.next;
		}

		// If anyone list become empty append the remaining
		// list element of other list.
		if (l1 == null) {
			p.next = l2;
		}

		else if (l2 == null) {
			p.next = l1;
		}

		// Return the resultant list without first extra
		// node
		return result.next;
	}

	// A utility function to print linked list
	static void printList(ListNode node)
	{
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(3);
		head1.next.next = new ListNode(5);

		// 1->3->5 LinkedList created
		ListNode head2 = new ListNode(0);
		head2.next = new ListNode(2);
		head2.next.next = new ListNode(4);

		// 0->2->4 LinkedList created
		ListNode mergedhead = mergeTwoLists(head1, head2);

		printList(mergedhead);
	}
}

/*Output: 0 1 2 3 4 5 
*/
/*Time complexity:  O(N)
*/
