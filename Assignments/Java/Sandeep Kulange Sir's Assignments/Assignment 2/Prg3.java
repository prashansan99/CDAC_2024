/*d. Declare a method-local variable strStatus of type String with the value "1" or "0" and attempt to convert it to a boolean. (Hint: parseBoolean method will not work as expected with "1" or "0").*/
package Pkg1;

public class Prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strStatus= "1";
		
		boolean b=Boolean.getBoolean(strStatus);
		
		System.out.println(b);
	}

}

/*Output: false   */
