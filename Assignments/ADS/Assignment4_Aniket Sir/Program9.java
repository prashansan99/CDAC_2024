/*Explanation: To sum two linked lists, start by creating an empty linked list, say result, for the sum. Reverse both original linked lists to start from the least significant digit.


Use two pointers to traverse the reversed lists simultaneously. For each pair of nodes, compute their sum and if the sum exceeds 9, store the remainder(sum modulo 10) in the new node and forward the carry to the next pair of nodes. Append each new node to result.


Continue until both lists are fully traversed, handling any remaining nodes from the longer list and carrying over any final carry. Finally, reverse the result linked list to get the sum of the two linked list.
*/
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class Program9 {

   
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

   
    static Node addTwoLists(Node num1, Node num2) {
        Node res = null;
        Node curr = null;
        int carry = 0;

        num1 = reverse(num1);
        num2 = reverse(num2);

        while (num1 != null || num2 != null || carry != 0) {
            int sum = carry;

          
            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }

          
            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }
          
          
            Node newNode = new Node(sum % 10);

         
            carry = sum / 10;

            if (res == null) {
                res = newNode;
                curr = newNode;
            } else {
              
                curr.next = newNode;
                curr = curr.next;
            }
        }

      
        return reverse(res);
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
        
        Node num1 = new Node(1);
        num1.next = new Node(2);
        num1.next.next = new Node(3);

        Node num2 = new Node(9);
        num2.next = new Node(9);
        num2.next.next = new Node(9);

        Node sum = addTwoLists(num1, num2);
        printList(sum);
    }
}
/*Output:
1 1 2 2 
*/
/*Time Complexity:  O(m + n), where m and n are the sizes of input linked list.
*/