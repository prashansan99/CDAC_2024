/*Explanation: Recursively traverse the doubly linked list until it reaches the last node.
While backtracking, reverse the links between the nodes. To reverse the links:
Change the next pointer of the current node to point to its previous node.
Change the prev pointer of the current node to point to its next node.
Adjust the head of the doubly linked list to point to the last node.
*/

class Program8 {
    static Node head;

    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

  
    static Node reverse(Node curr) {
      
       
        if (curr == null)
            return null;

        // Swap the next and prev pointers
        Node temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;

        // If prev is null after swap, this is the new head
        if (curr.prev == null) {
            return curr;
        }

        // Recurse for the next node
        return reverse(curr.prev);
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
      
        head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original linked list:");
        printList(head);

        // Reverse the doubly linked list
        head = reverse(head);

        System.out.println("Reversed linked list:");
        printList(head);
    }
}

/*Output: Original Linked list
1 2 3 4 
Reversed Linked list
4 3 2 1 
*/ 
/*Time complexity:  O(n)
*/
