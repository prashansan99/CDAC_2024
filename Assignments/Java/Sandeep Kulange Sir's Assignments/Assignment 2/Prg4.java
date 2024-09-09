/*e. Declare a method-local variable status of type boolean with the value true and convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(boolean)).*/
package Pkg1;

public class Prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean status= true;
		
		 Boolean b2 = Boolean.valueOf(status);
		 
		 System.out.println(b2);
		
		
	}

}


/*Output: true      */
