/*2. Working with java.lang.Byte*/
package Pkg1;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//b. Write a program to test how many bytes are used to represent a byte value using the BYTES field. (Hint: Use Byte.BYTES).		
		
		System.out.println("Bytes used for a byte: " + Byte.BYTES)	;
		
//c. Write a program to find the minimum and maximum values of byte using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Byte.MIN_VALUE and Byte.MAX_VALUE).
	
		System.out.println("Minimum bytes value: " + Byte.MIN_VALUE);
		System.out.println("Maximum bytes value: " + Byte.MAX_VALUE);
		
//d. Declare a method-local variable number of type byte with some value and convert it to a String using the toString method. (Hint: Use Byte.toString(byte)).
		
		byte number= 12;
		String s= Byte.toString(number);
		System.out.println("Byte to String: " + s);
		
//e. Declare a method-local variable strNumber of type String with some value and convert it to a byte value using the parseByte method. (Hint: Use Byte.parseByte(String)).		
		
		String strNumber= "20";
		byte p= Byte.parseByte(strNumber);
		System.out.println("Parsed number: " + p );
		
//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).		
		try
		{
		String strNumber1= "Ab12Cd3";
	    p= Byte.parseByte(strNumber1);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid string to byte conversion" + e);
		}
		
//g. Declare a method-local variable number of type byte with some value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(byte)).		
		byte number1= 20;
		byte b1= Byte.valueOf(number1);
		System.out.println("Byte to wrapper: " + b1);
		
//h. Declare a method-local variable strNumber of type String with some byte value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(String)).
		byte b3= Byte.valueOf(strNumber);
		System.out.println("Byte to wrapper: " + b3);
			
	}
}


/*Output:  Bytes used for a byte: 1
Minimum bytes value: -128
Maximum bytes value: 127
Byte to String: 12
Parsed number: 20
Invalid string to byte conversionjava.lang.NumberFormatException: For input string: "Ab12Cd3"
Byte to wrapper: 20
Byte to wrapper: 20
  */
