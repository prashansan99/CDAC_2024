//3. Working with java.lang.Short
package Pkg1;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//b. Write a program to test how many bytes are used to represent a short value using the BYTES field. (Hint: Use Short.BYTES).
		
		System.out.println(" Bytes required for short datatype: " + Short.BYTES);
		
//c. Write a program to find the minimum and maximum values of short using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Short.MIN_VALUE and Short.MAX_VALUE).		
		
		
		System.out.println("Minimum value of short: " + Short.MIN_VALUE);
		System.out.println("Maximum value of short: " + Short.MAX_VALUE);

//d. Declare a method-local variable number of type short with some value and convert it to a String using the toString method. (Hint: Use Short.toString(short)).
		
		Short number= 20;
		System.out.println("Conversion of variable of type short to String: "+ Short.toString(number));
		
//e. Declare a method-local variable strNumber of type String with some value and convert it to a short value using the parseShort method. (Hint: Use Short.parseShort(String)).
		
		String strNumber= "1234";
		short parsedShort= Short.parseShort(strNumber);
		System.out.println("Parsed short variable: "+ parsedShort);
		
//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a short value. (Hint: parseShort method will throw a NumberFormatException).
	
		try {
			strNumber= "Ab12Cd3";
			parsedShort= Short.parseShort(strNumber);
		}catch(NumberFormatException e) {
			System.out.println("Invalid string to short conversion" + e);
			
		}
		
//g. Declare a method-local variable number of type short with some value and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(short)).
		
		Short wrapperShort= Short.valueOf(number);
		System.out.println("Short to wrapper short: " + wrapperShort);
		
//h. Declare a method-local variable strNumber of type String with some short value and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(String)).

		wrapperShort= Short.valueOf("3500");
		System.out.println("String to Wrapper short: " + wrapperShort);
		
//i. Experiment with converting a short value into other primitive types or vice versa and observe the results.		
		
		int convertedToInt= number; // Implicit conversion
		long convertedToLong= number; // Implicit conversion
		float convertedToFloat= number; // Implicit conversion
		double convertedToDouble= number; // Implicit conversion
		
		System.out.println("Short to Int: " + convertedToInt);
		System.out.println("Short to long: " +  convertedToLong);
		System.out.println("Short to Float: " +  convertedToFloat);
		System.out.println("Short to double: " +  convertedToDouble);
	
	}
}

/*Output:  Bytes required for short datatype: 2
Minimum value of short: -32768
Maximum value of short: 32767
Conversion of variable of type short to String: 20
Parsed short variable: 1234
Invalid string to short conversionjava.lang.NumberFormatException: For input string: "Ab12Cd3"
Short to wrapper short: 20
String to Wrapper short: 3500
Short to Int: 20
Short to long: 20
Short to Float: 20.0
Short to double: 20.0
*/
