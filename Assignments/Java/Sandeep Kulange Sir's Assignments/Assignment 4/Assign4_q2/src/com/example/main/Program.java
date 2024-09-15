package com.example.main;

import com.example.util.CompoundInterestUtil;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		 CompoundInterestUtil util= new  CompoundInterestUtil();
		 while((choice= CompoundInterestUtil.menuList())!=0) {
			 switch(choice) {
			 case 1:
				 util.acceptRecord();
			 	 break;
			 case 2:
				 util.calculate();
				 break;
			 case 3:
				 util.printRecord();
				 break;
			 }
		 }
		 
		 CompoundInterestUtil.releaseResource();
	}

}

/*Output:
Initial Investment amount: 500000
Annual Interest rate: 3
No of times Interest compunded per year: 1
Investment Duration: 2
0.Exit
1.Accept record
2.Calculate
3.Print Record
2
0.Exit
1.Accept record
2.Calculate
3.Print Record
3
Initial investment amount: 500000.0, Annual Interest rate: 3, No of times Interest compunded per year:  1, Investment Duration: 2
Future Value: 8000000.0
Total Interest: 7500000.0
0.Exit
1.Accept record
2.Calculate
3.Print Record
*/
