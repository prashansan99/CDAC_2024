/*Explanation: The very basic idea is to use two nested loops, the outer loop for picking an element and the inner loop for checking the repeating character for picked element.
	If no repeating character found for any characters then return the index of currently picked element, otherwise return -1;
*/
import java.util.Scanner;
class NonRepeatedChar{
	private static char isNotRepeated(String str){
		char c;
		for(int i=0; i<str.length(); i++){
			boolean bool=true;
			for(int j=0; j<str.length();j++){
				if(j!=i && str.charAt(i)==str.charAt(j)){
					bool = false;
					break;
				}
			}
			if(bool)
				return str.charAt(i);
		}
		return '-';
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	//Scanner file to tke input(s)
		System.out.print("Enter the String: ");
		String str = sc.nextLine();					//Storing i/p from user in var
		System.out.println(isNotRepeated(str));
	}
}
/*Output:
Enter the String: Prashansa
Prshn
*/

/*Time complexity: O(n^2)
	*/
