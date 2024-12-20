/*Explanation:
Initialize an empty HashSet to store the addresses (or references) of the visited nodes.
Start traversing the linked list from head and for every node check if its address (or reference) is already in the HashSet
If the node is NULL, represents the end of Linked List , return false as there is no loop.
If the node’s address is not in the HashSet, add it to the HashSet.
If the node’s address is already in the HashSet, which indicates there’s a cycle (loop) in the list. In this case, return true.
*/
// Java program to detect loop in a linked list
// using hashset
import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class Program3 {

  
    static boolean detectLoop(Node head) {
        Set<Node> st = new HashSet<>();

        // loop that runs till the head is null
        while (head != null) {

           if (st.contains(head))
                return true;

            st.add(head);

            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
      
        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
/*Output:
true
*/
/*Time complexity: O(n)
*/
