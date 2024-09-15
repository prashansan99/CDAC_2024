package com.example.main;

//import com.example.domain;
import com.example.domain.LoanAmortizationCalculatorUtil;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		 LoanAmortizationCalculatorUtil util= new LoanAmortizationCalculatorUtil();
		 while((choice=  LoanAmortizationCalculatorUtil.menuList() )!= 0)
		 {
			 switch(choice) {
			 case 1:
				 util.acceptRecord();
				 break;
			 case 2: 
				 util.calculateRecord();
				 break;
			 case 3:
				 util.printRecord();
				 break;
				 
			 
			 }
		 }
		 LoanAmortizationCalculatorUtil.releaseResource();
	}

}


/*Output: 
0.Exit
1.Accept Record
2.Calculate Record
3.Print Record
Enter choice: 1
Principle amount: 50000
Annual Interest rate: 2
Loan Term: 
1
0.Exit
1.Accept Record
2.Calculate Record
3.Print Record
Enter choice: 2
0.Exit
1.Accept Record
2.Calculate Record
3.Print Record
Enter choice: 3
50000.0 2.0 1
Monthly interest rate: 0.0016666667
No. of months: 12
Monthly payment: 4211.947439710457
0.Exit
1.Accept Record
2.Calculate Record
3.Print Record
Enter choice: */
