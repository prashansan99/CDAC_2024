import java.util.*;
//package Pkg1;

public class Prg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operator;
	    Double number1, number2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;
	      default:
	        System.out.println("Invalid operator!");
	        break;
	}
}
}

/*Output: 

Choose an operator: +, -, *, or /
+
Enter first number
1
Enter second number
2
1.0 + 2.0 = 3.0

C:\Users\PRASHANSA\Eclipse\eclipse-jee-2024-06-R-win32-x86_64\eclipse>Java Prg12
Choose an operator: +, -, *, or /
-
Enter first number
2
Enter second number
1
2.0 - 1.0 = 1.0
   */