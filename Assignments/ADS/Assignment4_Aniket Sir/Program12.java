/*Explanation: The idea is to find the middle and last nodes using Hare and Tortoise Algorithm. Traverse linked list using a slow pointer and a fast pointer. 
Move the slow pointer to the next node(one node forward) and the fast pointer to the next of the next node(two nodes forward). 
When the fast pointer reaches the last node or second last node, then the slow pointer will reach the middle of the linked list. 
We can now easily split circular linked list and then point the tail nodes to their respective head nodes.
*/

class Node {
    int data;
    Node next;

    Node(int newValue) {
        data = newValue;
        next = null;
    }
}

class Pair {
    Node first;
    Node second;

    Pair(Node first, Node second) {
        this.first = first;
        this.second = second;
    }
}

public class GfG {

    // Function to split a list into two lists.
    static Pair splitList(Node head) {
        Node slow = head;
        Node fast = head;

        if (head == null) {
            return new Pair(null, null);
        }

       
        while (fast.next != head && 
               fast.next.next != head) {
            fast = fast.next.next;
            slow = slow.next;
        }

     
        if (fast.next.next == head) {
            fast = fast.next;
        }

        Node head1 = head;

        Node head2 = slow.next;

      
        fast.next = slow.next;

        // Make the first half circular
        slow.next = head;

        return new Pair(head1, head2);
    }

    static void printList(Node head) {
        Node curr = head;
        if (head != null) {
            do {
                System.out.print(curr.data + " ");
                curr = curr.next;
            } while (curr != head);
              System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Node head1 = null;
        Node head2 = null;

        // Created linked list will be 1->2->3->4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;

        Pair result = splitList(head);
        head1 = result.first;
        head2 = result.second;

        printList(head1);
        printList(head2);
    }   
}
/*Output: 1 2 
3 4 
*/
/*Time complexity: O(n)
*/