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
	
		