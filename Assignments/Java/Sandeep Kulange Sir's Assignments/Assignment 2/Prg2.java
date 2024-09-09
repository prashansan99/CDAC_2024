/*c. Declare a method-local variable strStatus of type String with the value "true" and convert it to a boolean using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String)).*/
package Pkg1;

public class Prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strStatus="true";
		
		boolean b= Boolean.parseBoolean(strStatus);
		
		System.out.println(b);
		
	}

}


/*Output:  true  */
