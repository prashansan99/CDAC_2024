package Pkg1;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// a. Explore the Java API documentation for java.lang.Integer and observe its modifiers and super types.
// No code required, this was for reading the documentation.
		
// b. Write a program to test how many bytes are used to represent an int value using the BYTES field. (Hint: Use Integer.BYTES).		
	
	System.out.println("Bytes required for Integer value: " + Integer.BYTES);
	
	
//c. Write a program to find the minimum and maximum values of int using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Integer.MIN_VALUE and Integer.MAX_VALUE).

	System.out.println("Integer Min Value: " + Integer.MIN_VALUE);
    System.out.println("Integer Max Value: " + Integer.MAX_VALUE);

// d) Declare a method-local variable number of type int and convert it to a String.
    int number = 12345;
    String intString = Integer.toString(number);
    System.out.println("Integer to String: " + intString);

// e) Declare a method-local variable strNumber of type String and convert it to an int value.
    String strNumber = "56789";
    int parsedInt = Integer.parseInt(strNumber);
    System.out.println("String to Integer: " + parsedInt);

// f) Attempt to convert invalid String to int (will throw an exception).
    try {
        strNumber = "Ab12Cd3";
        parsedInt = Integer.parseInt(strNumber);
    } catch (NumberFormatException e) {
        System.out.println("Invalid String to Integer conversion error: " + e);
    }

// g) Convert int to Wrapper class (Integer).
    Integer wrapperInt = Integer.valueOf(number);
    System.out.println("Integer to Wrapper Integer: " + wrapperInt);

    // h) Convert String to Wrapper class (Integer).
    wrapperInt = Integer.valueOf("34567");
    System.out.println("String to Wrapper Integer: " + wrapperInt);

// i) Declare two integer variables with values 10 and 20, and add them using Integer.sum().
    int num1 = 10;
    int num2 = 20;
    int sum = Integer.sum(num1, num2);
    System.out.println("Sum of 10 and 20: " + sum);

// j) Find the minimum and maximum between 10 and 20 using Integer.min() and Integer.max().
    int min = Integer.min(num1, num2);
    int max = Integer.max(num1, num2);
    System.out.println("Min of 10 and 20: " + min);
    System.out.println("Max of 10 and 20: " + max);

// k) Convert an integer value (7) to binary, octal, and hexadecimal strings.
    int value = 7;
    String binaryString = Integer.toBinaryString(value);
    String octalString = Integer.toOctalString(value);
    String hexString = Integer.toHexString(value);
    System.out.println("Integer 7 in Binary: " + binaryString);
    System.out.println("Integer 7 in Octal: " + octalString);
    System.out.println("Integer 7 in Hexadecimal: " + hexString);

// l) Convert int to other primitive types.
    long convertedToLong = number; // Implicit conversion to long
    float convertedToFloat = number; // Implicit conversion to float
    double convertedToDouble = number; // Implicit conversion to double

    System.out.println("Integer to Long: " + convertedToLong);
    System.out.println("Integer to Float: " + convertedToFloat);
    System.out.println("Integer to Double: " + convertedToDouble);
		
	}
}

/*Output: Bytes required for Integer value: 4
Integer Min Value: -2147483648
Integer Max Value: 2147483647
Integer to String: 12345
String to Integer: 56789
Invalid String to Integer conversion error: java.lang.NumberFormatException: For input string: "Ab12Cd3"
Integer to Wrapper Integer: 12345
String to Wrapper Integer: 34567
Sum of 10 and 20: 30
Min of 10 and 20: 10
Max of 10 and 20: 20
Integer 7 in Binary: 111
Integer 7 in Octal: 7
Integer 7 in Hexadecimal: 7
Integer to Long: 12345
Integer to Float: 12345.0
Integer to Double: 12345.0   */
