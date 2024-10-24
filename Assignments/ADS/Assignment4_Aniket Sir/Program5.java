/*Explanation: The idea is to count the number of nodes in linked list in the first pass, say len. 
In the second pass, return the (len – n + 1)th nodes from beginning of the Linked List.
*/

// Link list node
class Node {
    int data;
    Node next;
    
   
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class Program5{
     
    static int findNthFromLast(Node head, int N) {
        int len = 0, i;
       
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // Check if value of N is not more than length of the linked list
        if (len < N)
            return -1;

        temp = head;

        // Get the (len - N + 1)th node from the beginning
        for (i = 1; i < len - N + 1; i++)
            temp = temp.next;

        return temp.data;
    }

    public static void main(String[] args) {
      
        Node head = new Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

     
        System.out.println(findNthFromLast(head, 4));
    }
}
/*Output: 35
*/
/*Time complexity: O(n)
*/
