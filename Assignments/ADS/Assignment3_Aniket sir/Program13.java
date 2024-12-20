/*Explanation:
insert(p): Inserts a new element with priority p.
extractMax(): Extracts an element with maximum priority.
remove(i): Removes an element pointed by an iterator i.
getMax(): Returns an element with maximum priority.
changePriority(i, p): Changes the priority of an element pointed by i to p.

*/
import java.util.*;
class Program13{

static int []H = new int[50];
static int size = -1;


static int parent(int i)
{
  return (i - 1) / 2;
}


static int leftChild(int i)
{
  return ((2 * i) + 1);
}


static int rightChild(int i)
{
  return ((2 * i) + 2);
}


static void shiftUp(int i)
{
  while (i > 0 && 
         H[parent(i)] < H[i]) 
  {
   
    swap(parent(i), i);

 
    i = parent(i);
  }
}

static void shiftDown(int i)
{
  int maxIndex = i;

  // Left Child
  int l = leftChild(i);

  if (l <= size && 
      H[l] > H[maxIndex]) 
  {
    maxIndex = l;
  }

  // Right Child
  int r = rightChild(i);

  if (r <= size && 
      H[r] > H[maxIndex]) 
  {
    maxIndex = r;
  }

  // If i not same as maxIndex
  if (i != maxIndex) 
  {
    swap(i, maxIndex);
    shiftDown(maxIndex);
  }
}


static void insert(int p)
{
  size = size + 1;
  H[size] = p;

 
  shiftUp(size);
}


static int extractMax()
{
  int result = H[0];


  H[0] = H[size];
  size = size - 1;


  shiftDown(0);
  return result;
}

// Function to change the priority
// of an element
static void changePriority(int i, 
                           int p)
{
  int oldp = H[i];
  H[i] = p;

  if (p > oldp) 
  {
    shiftUp(i);
  }
  else 
  {
    shiftDown(i);
  }
}


static int getMax()
{
  return H[0];
}


static void remove(int i)
{
  H[i] = getMax() + 1;

  shiftUp(i);

  extractMax();
}
  
static void swap(int i, int j)
{
  int temp= H[i];
  H[i] = H[j];
  H[j] = temp;
}

// Driver Code
public static void main(String[] args)
{

  insert(45);
  insert(20);
  insert(14);
  insert(12);
  insert(31);
  insert(7);
  insert(11);
  insert(13);
  insert(7);

  int i = 0;

  // Priority queue before extracting max
  System.out.print("Priority Queue : ");
  while (i <= size) 
  {
    System.out.print(H[i] + " ");
    i++;
  }

  System.out.print("\n");

  // Node with maximum priority
  System.out.print("Node with maximum priority : " + 
                    extractMax() + "\n");

  // Priority queue after extracting max
  System.out.print("Priority queue after " + 
                   "extracting maximum : ");
  int j = 0;
  while (j <= size) 
  {
    System.out.print(H[j] + " ");
    j++;
  }

  System.out.print("\n");

  changePriority(2, 49);
  System.out.print("Priority queue after " + 
                   "priority change : ");
  int k = 0;
  while (k <= size) 
  {
    System.out.print(H[k] + " ");
    k++;
  }

  System.out.print("\n");

  // Remove element at index 3
  remove(3);
  System.out.print("Priority queue after " + 
                   "removing the element : ");
  int l = 0;
  while (l <= size) 
  {
    System.out.print(H[l] + " ");
    l++;
  }
}
}
/*Output:
Priority Queue : 45 31 14 13 20 7 11 12 7 
Node with maximum priority : 45
Priority queue after extracting maximum : 31 20 14 13 7 7 11 12 
Priority queue after priority change : 49 20 31 13 7 7 11 12 
Priority queue after removing the element : 49 20 31 12 7 7 11 
*/

/*Time Complexity: O(log N) 
*/


