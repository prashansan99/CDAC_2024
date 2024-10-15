/*Explanation: The problem can be easily solved using 2 nested for loops. The outer loop will be for each node of the 1st list and the inner loop will be for each node of the 2nd list. In the inner loop, check if any of the nodes of the 2nd list is the same as the current node of the first linked list.
 The first node which is same as the current node is the intersection point.
 */

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class GfG {
      

    public static Node getIntersectionNode(Node head1,
                                           Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                  
                // if both Nodes are same
                if (temp == head2)
                    return head2;
                temp = temp.next;
            }
            head2 = head2.next;
        }
          
      
        return null;
    }

    public static void main(String[] args) {

       

        // creation of first list
          Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        // creation of second list
          Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);
        head2.next.next.next = head1.next;

        Node intersectionPoint
            = getIntersectionNode(head1, head2);

        if (intersectionPoint == null)
            System.out.print(" No Intersection Point \n");
        else
            System.out.print("Intersection Point: "
                             + intersectionPoint.data);
    }
}
/*Output: Intersection Point: 15
*/
/*Time complexity:  O(M + N), where M and N are the lengths of the two lists.
*/