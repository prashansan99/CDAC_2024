/*Explanation: A Doubly Linked List (DLL) contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in a singly linked list. 
*/
import java.util.*;
import java.lang.*;

class node{
	int key;
	node prev;
	node next;
	node(){
		prev = null;
		next = null;
	}
}

class Main{
	static node head = null;
	static node first = null;
	static node tail = null;
	static node temp = null;
	static int i = 0;
	
	static void addnode(int k)
	{
	
		
		node ptr = new node();
	
		
		ptr.key = k;
	
		// Next and prev pointer to NULL
		ptr.next = null;
		ptr.prev = null;
	
		// If Linked List is empty
		if (head == null) {
			head = ptr;
			first = head;
			tail = head;
		}
	
		// Else insert at the end of the
		// Linked List
		else {
			temp = ptr;
			first.next = temp;
			temp.prev = first;
			first = temp;
			tail = temp;
		}
	
		// Increment for number of Nodes
		// in the Doubly Linked List
		i++;
	}
	
	
	static void traverse()
	{
		// Nodes points towards head node
		node ptr = head;
	
		
		while (ptr != null) {
	
			// Print key of the node
			System.out.print( ptr.key+" ");
			ptr = ptr.next;
		}
		System.out.println();
	}
	

	static void insertatbegin(int k)
	{
	
		// Allocating memory
		// to the Node ptr
		node ptr = new node();
	
		// Assign Key to value k
		ptr.key = k;
	
		// Next and prev pointer to NULL
		ptr.next = null;
		ptr.prev = null;
	
		// If head is NULL
		if (head == null) {
			first = ptr;
			first = head;
			tail = head;
		}
	
		// Else insert at beginning and
		// change the head to current node
		else {
			temp = ptr;
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
		i++;
	}

	// Function to insert Node at end
	static void insertatend(int k)
	{
	
		// Allocating memory
		// to the Node ptr
		node ptr= new node();
	
		// Assign Key to value k
		ptr.key = k;
	
		// Next and prev pointer to NULL
		ptr.next = null;
		ptr.prev = null;
	
		// If head is NULL
		if (head == null) {
			first = ptr;
			first = head;
			tail = head;
		}
	
		// Else insert at the end
		else {
			temp = ptr;
			temp.prev = tail;
			tail.next = temp;
			tail = temp;
		}
		i++;
	}
	
	
	static void insertatpos(int k, int pos)
	{
	
		// For Invalid Position
		if (pos < 1 || pos > i + 1) {
			System.out.println("Please enter a valid position");
		}
	
		else if (pos == 1) {
			insertatbegin(k);
		}
	
	
		else if (pos == i + 1) {
			insertatend(k);
		}
	
		
		else {
			node src = head;
	
			// Move head pointer to pos
			while (pos--!=0) {
				src = src.next;
			}
	
			// Allocate memory to new Node
			node da, ba;
			node ptr = new node();
			ptr.next = null;
			ptr.prev = null;
			ptr.key = k;
	
			ba = src;
			da = (src.prev);
			ptr.next = (ba);
			ptr.prev = (da);
			da.next = ptr;
			ba.prev = ptr;
			i++;
		}
	}
	
	
	static void delatbegin()
	{
		// Move head to next and
		// decrease length by 1
		head = head.next;
		i--;
	}
	
	
	static void delatend()
	{
		
		tail = tail.prev;
		tail.next = null;
		i--;
	}
	
	
	static void delatpos(int pos)
	{
	
		// If invalid position
		if (pos < 1 || pos > i + 1) {
			System.out.println("Please enter a valid position");
		}
	
		// If position is 1, then
		// call delatbegin()
		else if (pos == 1) {
			delatbegin();
		}
	
		// If position is at the end, then
		// call delatend()
		else if (pos == i) {
			delatend();
		}
	
		// Else traverse till pos, and
		// delete the node at pos
		else {
			// Src node to find which
			// node to be deleted
			node src = head;
			pos--;
	
			// Traverse node till pos
			while (pos--!=0) {
				src = src.next;
			}
	
			// previous and after node
			// of the src node
			node pre, aft;
			pre = (src.prev);
			aft = (src.next);
	
			// Change the next and prev
			// pointer of pre and aft node
			pre.next = (aft);
			aft.prev = (pre);
	
			// Decrease the length of the
			// Linked List
			i--;
		}
	}
	public static void main(String args[])
	{
	
		// Adding node to the linked List
		addnode(2);
		addnode(4);
		addnode(9);
		addnode(1);
		addnode(21);
		addnode(22);
	
		// To print the linked List
		System.out.print("Linked List: ");
		traverse();
		System.out.println();
	
		// To insert node at the beginning
		insertatbegin(1);
		System.out.print("Linked List after inserting 1 at beginning: ");
		traverse();
	
		// To insert at the end
		insertatend(0);
		System.out.print("Linked List after inserting 0 at end: ");
		traverse();
	
		// To insert Node with
		// value 44 after 3rd Node
		insertatpos(44, 3);
		System.out.print("Linked List after inserting 44 after 3rd Node: ");
		traverse();
		System.out.println();
	
		
		delatbegin();
		System.out.print("Linked List after deleting node at beginning: ");
		traverse();
	
		
		delatend();
		System.out.print("Linked List after deleting node at end: ");
		traverse();
	
		
		System.out.print("Linked List after deleting node at position 5: ");
		delatpos(5);
		traverse();
	}
}
/*Output: 
Linked List: 2 4 9 1 21 22 

Linked List after inserting 1 at beginning: 1 2 4 9 1 21 22 
Linked List after inserting 0 at end: 1 2 4 9 1 21 22 0 
Linked List after inserting 44 after 3rd Node: 1 2 4 44 9 1 21 22 0 

Linked List after deleting node at beginning: 2 4 44 9 1 21 22 0 
Linked List after deleting node at end: 2 4 44 9 1 21 22 
Linked List after deleting node at position 5: 2 4 44 9 21 22 
*/
/*Time complexity: O(n)
*/
