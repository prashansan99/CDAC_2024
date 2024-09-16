package com.example.logger;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				Logger lg1 = Logger.getInstance();
				Scanner sc = new Scanner(System.in);
				Logger lg2 = Logger.getInstance();
				
				System.out.print("Enter log message for Logger1: ");
				lg1.log(sc.next());
				System.out.println(lg1.getLog());
				System.out.print("Enter log message for Logger2: ");
				//lg2.log(sc.next());
				System.out.println(lg2.getLog());
				lg1.clearLog();
				System.out.println(lg1.getLog());
				System.out.println("Instance of the Logger: "+ lg2);
				sc.close();
	}

}

/*Output:
 Enter log message for Logger1: Good Morning
Good
Enter log message for Logger2: Good
Logs cleared!
Currently no log exist!
Instance of the Logger: com.example.logger.Logger@26ba2a48
*/
