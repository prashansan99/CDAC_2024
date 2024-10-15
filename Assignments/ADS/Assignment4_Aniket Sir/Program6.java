/*Explanation: Traverse the list from the head (or start) node. While traversing, compare each node with its next node. If the data of the next node is the same as the current node then delete the next node.
 Before we delete a node, we need to store the next pointer of the node 
 */
class LinkedList
{
	// Head of list
	Node head; 

	// Linked list Node
	class Node
	{
		int data;
		Node next;
		Node(int d) 
		{
			data = d; 
			next = null; 
		}
	}

	void removeDuplicates()
	{
		
		Node curr = head;

		// Traverse list till the 
		// last node 
		while (curr != null) 
		{
			Node temp = curr;

			while(temp != null && 
				temp.data == curr.data) 
			{
				temp = temp.next;
			}

		
			curr.next = temp;
			curr = curr.next;
		}
	}
					
	// Utility functions 

	// Inserts a new Node at front of 
	// the list. 
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		// 3. Make next of new Node as head 
		new_node.next = head;

		// 4. Move the head to point to 
		// new Node 
		head = new_node;
	}

	// Function to print linked list 
	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		} 
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();
		llist.push(20);
		llist.push(13);
		llist.push(13);
		llist.push(11);
		llist.push(11);
		llist.push(11);
		
		System.out.println(
			"List before removal of duplicates");
		llist.printList();
		
		llist.removeDuplicates();
		
		System.out.println(
			"List after removal of elements");
		llist.printList();
	}
} 

/*Output: Linked list before duplicate removal  11 11 11 13 13 20
Linked list after duplicate removal  11 13 20
*/
/*Time complexity:  O(n)
*/



