/*Explanation: To flatten a multilevel linked list, start from the top level and process each node sequentially. For each node, if it has a child node, append this child node to the end of the current list. Continue this process for every node, updating the end of the list accordingly, until all
 nodes are processed and the list is flattened.
 */

class Node {
    int data;
    Node next, child;

    Node(int x) {
        data = x;
        next = null;
          child = null;
    }
}

public class GfG {

 
    static void flattenList(Node head) {

        // Base case
        if (head == null)
            return;

        
        Node tail = head;
        while (tail.next != null)
            tail = tail.next;

       
        Node curr = head;

        while (curr != null) {

            // If current node has a child
            if (curr.child != null) {

                // then append the child at the end of current list
                tail.next = curr.child;

                // and update the tail to new last node
                Node tmp = curr.child;
                while (tmp.next != null)
                    tmp = tmp.next;
                tail = tmp;

                // Remove link between curr and child node
                curr.child = null;
            }

            // Change current node
            curr = curr.next;
        }
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
     
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.child = new Node(4);
        head.child.next = new Node(5);
        head.next.next.child = new Node(6);
        head.child.child = new Node(7);

        flattenList(head);
        printList(head);
    }
}
/*Output: 1 2 3 4 5 6 7 
*/
/*Time complexity: O(n)
*/
