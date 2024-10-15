/*Explanation: Keep an array of size K. The idea is to keep the array sorted so that the Kth largest element can be found in O(1) time (we just need to return the first element of the array,
 if the array is sorted in increasing order. For every new element in the stream, check if the new element is smaller than the current Kth largest element. 
 If yes, then ignore it. If no, then remove the smallest element from the array and insert the new element in sorted order. 

*/
import java.io.*;
import java.util.*;

class Program12 {

	
	static PriorityQueue<Integer> min;
	static int k;

	static List<Integer> getAllKthNumber(int arr[])
	{

		
		List<Integer> list = new ArrayList<>();

		
		for (int val : arr) {

			
			if (min.size() < k)
				min.add(val);

			/*
			otherwise ,
			first we compare the current value with the
			min heap TOP value

			if TOP val > current element , no need to
			remove TOP , bocause it will be the largest kth
			element anyhow

			else we need to update the kth largest element
			by removing the top lowest element
			*/

			else {
				if (val > min.peek()) {
					min.poll();
					min.add(val);
				}
			}

			// if heap size >=k we add
			// kth largest element
			// otherwise -1

			if (min.size() >= k)
				list.add(min.peek());
			else
				list.add(-1);
		}
		return list;
	}

	public static void main(String[] args)
	{
		min = new PriorityQueue<>();

		k = 3;

		int arr[] = { 1, 2, 3, 4, 5, 6 };

	
		List<Integer> res = getAllKthNumber(arr);

		for (int x : res)
			System.out.println(x);
	}
}

/*Output:
-1 -1 -1 1 2 3 
*/

/*Time Complexity:
O(N * log K) 
*/