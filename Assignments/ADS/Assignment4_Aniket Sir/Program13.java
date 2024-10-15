/*Explanation: 
Allocate memory for the newNode with the given data.
If the list is empty, update the head to point to the newNode.
Otherwise, insert the newNode in its appropriate position which is  data <= head->data:
If inserting before the head , traverse till last node, update it’s next to newNode and then update the head to newNode.
else, traverse to find the position where input data is smaller or equal to head’s data and insert newNode by adjusting the necessary pointers.
*/
// Java program for sorted insert
// in circular linked list

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Program13{
    
    static Node sortedInsert(Node head, int data) {
        
        
        Node newNode = new Node(data);
        
      
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node curr = head;
        Node nextToCurr = head.next;

        if (data <= head.data) {
            Node lastNode = head;
            while (lastNode.next != head) {
                
               
                lastNode = lastNode.next;
            }

        
            newNode.next = head;


            lastNode.next = newNode;

          
            return newNode;
        }

        
        while (curr.next != head) {
            if (curr.data < data && nextToCurr.data >= data) {
                
                // Set new node's next to current's next
                newNode.next = curr.next;
                curr.next = newNode;
                return head;
            } else {
                
                // Move to the next node
                curr = curr.next;
                nextToCurr = nextToCurr.next;
            }
        }

        // Insert at the end of the list
        newNode.next = head;
        curr.next = newNode;
        return head;
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
     
        Node head = new Node(3);
        head.next = new Node(7);
        head.next.next = new Node(9);
        head.next.next.next = new Node(11);
        head.next.next.next.next = head;

        head = sortedInsert(head, 8);
        printList(head);
    }
}
/*Output: 3 7 8 9 11 
*/
/*Time complexity:  O(n)
*/
