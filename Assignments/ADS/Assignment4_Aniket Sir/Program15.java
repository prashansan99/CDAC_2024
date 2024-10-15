/*Explanation: The idea is to traversing the entire linked list once to count the total number of nodes. After determining the total count, traverse the list again and stop at the (count/2)th node to return its value. 
This method requires two passes through the linked list to find the middle element.
*/

class Node {
    int data;
    Node next;

  
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class program15{

    
    static int getLength(Node head) {

      
        int length = 0;

       
        while (head != null) {
            length++;
            head = head.next;
        }


        return length;
    }

  
    static int getMiddle(Node head) {
      
       
        int length = getLength(head);

        
        int mid_index = length / 2;
        while (mid_index > 0) {
            head = head.next;
            mid_index--;
        }
      
        return head.data;
    }

    public static void main(String[] args) {

        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(getMiddle(head));
    }
}
/*Output: 40
*/
/*Time complexity: O(2 * n) = O(n) where n is the number of nodes in the linked list.
*/
