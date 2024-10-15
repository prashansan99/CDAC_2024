/*Explanation: 1. Find the occurrences of character ‘a’ in the given string. 
2. Find the No. of repetitions which are required to find the ‘a’ occurrences. 
3. Multiply the single string occurrences to the No. of repetitions. 
4. If given n is not the multiple of given string size then we will find the ‘a’ occurrences in the remaining substring.
	*/
import java.util.*;

public class RepeatedChar
{
   public static void printDuplicates(String str)
    {
        int len = str.length();

        // Sorting the string
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);

        // Loop through the sorted string to find duplicates
        for (int i = 0; i < len; i++) {
            int count = 1;

            // Counting the occurrences of each character
            while (i < len - 1
                   && sortedStr.charAt(i)
                          == sortedStr.charAt(i + 1)) {
                count++;
                i++;
            }

            // Printing the duplicate character and its
            // count
            if (count > 1) {
                System.out.println(sortedStr.charAt(i)
                                   + ", count = " + count);
            }
        }
    }

    public static void main(String[] args)
    {
		String str;
		System.out.println("Enter the string: ");
		Scanner sc= new Scanner(System.in);
		str= sc.nextLine();
	
        printDuplicates(str);
    }
}
/*Output:
aaabcd
a 3
*/
/*Time Complexity: O(length(str))
	*/
		
