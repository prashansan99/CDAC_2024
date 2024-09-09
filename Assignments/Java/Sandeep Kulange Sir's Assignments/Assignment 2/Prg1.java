/* b. Declare a method-local variable status of type boolean with the value true and convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).*/
package Pkg1;

public class Prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean status=true;
		
		String s= Boolean.toString(status);
		
		System.out.println(s);
		
	}

}

/*Output: true      */