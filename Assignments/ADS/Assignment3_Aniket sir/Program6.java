/*Explanation:  Define a structure consisting of an array and two pointers front and rear.
Initialize the array with MAX_SIZE.
Initialize both the front and rear pointers to -1.
The insertion of elements will take place through the rear pointer and the deletion of elements will take place through the front pointer.
Implement  isFull, isEmpty, Enqueue, and Dequeue  functions to manipulate the elements of the queue easily.
*/
import java.util.*;

class Program5 {
    int front, rear, capacity;
    int[] queue;

  
    Queue(int c) {
        front = 0;
        rear = -1;
        capacity = c;
        queue = new int[capacity];
    }

    
    void enqueue(int data) {
        // Check if the queue is full
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }

       
        queue[++rear] = data;
    }

   
    void dequeue() {
        
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

       
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }

     
        rear--;
    }

   
    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

       
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " <-- ");
        }
        System.out.println();
    }

    
    void front() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element is: " + queue[front]);
    }

    public static void main(String[] args) {
       
        Queue q = new Queue(4);

      
        q.display();

     
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

       
        q.display();

       
        q.enqueue(60);

      
        q.display();

      
        q.dequeue();
        q.dequeue();

        System.out.println("After two node deletions");

   
        q.display();

        System.out.println("After one insertion");
        q.enqueue(60);

        q.display();

       
        q.front();
    }
}

/*Output:
Queue is Empty
 20 <--  30 <--  40 <--  50 <-- 

Queue is full
 20 <--  30 <--  40 <--  50 <-- 

After two node deletions
 40 <--  50 <-- 

After one insertion
 40 <--  50 <--  60 <-- 

Front Element...
*/
/*Time complexity:  O(1) for Enqueue (element insertion in the queue) as we simply increment pointer and put value in array and O(N) for Dequeue 
(element removing from the queue) as we use for loop to implement that.
*/
