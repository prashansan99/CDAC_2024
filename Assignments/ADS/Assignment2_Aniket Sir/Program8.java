/*Explanation: update(l, r, x) : Run a loop from l to r and add x to all elements from A[l] to A[r]
printArray() : Simply print A[].
Time complexities of both of the above operations is O(n)
An efficient solution is to use difference array. 
Difference array D[i] of a given array A[i] is defined as D[i] = A[i]-A[i-1] (for 0 < i < N ) and D[0] = A[0] considering 0 based indexing.
Difference array can be used to perform range update queries “l r x” where l is left index, r is right index and x is value to be added and 
after all queries you can return original array from it. Where update range operations can be performed in O(1) complexity.
update(l, r, x) : Add x to D[l] and subtract it from D[r+1], i.e., we do D[l] += x, D[r+1] -= x
printArray() : Do A[0] = D[0] and print it. For rest of the elements, do A[i] = A[i-1] + D[i] and print them.
	*/
// Java code to demonstrate Difference Array 
class Program8 { 
	
	 
	static void initializeDiffArray(int A[], int D[]) 
	{ 
		
		int n = A.length; 

		D[0] = A[0]; 
		D[n] = 0; 
		for (int i = 1; i < n; i++) 
			D[i] = A[i] - A[i - 1]; 
	} 

	
	static void update(int D[], int l, int r, int x) 
	{ 
		D[l] += x; 
		D[r + 1] -= x; 
	} 

	
	static int printArray(int A[], int D[]) 
	{ 
		for (int i = 0; i < A.length; i++) { 
			
			if (i == 0) 
				A[i] = D[i]; 

			
			else
				A[i] = D[i] + A[i - 1]; 

			System.out.print(A[i] + " "); 
		} 
		
		System.out.println(); 
		
		return 0; 
	} 
	
	public static void main(String[] args) 
	{ 
		
		int A[] = { 10, 5, 20, 40 }; 
		int n = A.length; 
	
		int D[] = new int[n + 1]; 
		initializeDiffArray(A, D); 

	
		update(D, 0, 1, 10); 
		printArray(A, D); 

		
		update(D, 1, 3, 20); 
		update(D, 2, 2, 30); 
		
		printArray(A, D); 
	} 
} 
/*Output: 20 15 20 40 
20 35 70 60 
	*/
/*Time complexity:  O(n)
	*/


