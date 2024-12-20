/*Explanation: 
Initialize an array to represent the stack.
Use the end of the array to represent the top of the stack.
Implement push (add to end), pop (remove from the end), and peek (check end) operations, ensuring to handle empty and full stack conditions.
*/
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    Stack() 
    { 
        top = -1; 
    } 

    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 

    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 

    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
    
    void print(){ 
    for(int i = top;i>-1;i--){ 
    System.out.print(" "+ a[i]); 
    } 
} 
} 


class Program1{ 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(44); 
        s.push(55); 
        s.push(66); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println("Top element is :" + s.peek()); 
        s.print(); 
    } 
} 

/*Output:
10 pushed into stack
20 pushed into stack
30 pushed into stack
30 Popped from stack
Top element is : 20
 20 10 
*/
/*Time complexity: O(1)
*/


