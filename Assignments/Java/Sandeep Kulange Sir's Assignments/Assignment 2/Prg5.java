/*f. Declare a method-local variable strStatus of type String with the value "true" and convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(String)).*/
package Pkg1;

public class Prg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strStatus= "true";
		
		Boolean b1= Boolean.valueOf(strStatus);
		
		System.out.println(b1);

	}

}


/*Output: true   */

/*g) Experiment converting Boolean to other types- Not done because Boolean only converts to String.*/
