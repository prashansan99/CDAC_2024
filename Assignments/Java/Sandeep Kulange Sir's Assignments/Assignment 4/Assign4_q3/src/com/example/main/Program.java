package com.example.main;

import com.example.util.BMIUtil;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		int choice;
		
		BMIUtil util= new BMIUtil();
		while((choice= BMIUtil.menuList())!=0) {
			switch(choice) {
			case 1:
				util.acceptRecord();
				break;
			case 2:
				util.calculateBMI();
				break;
			case 3:
				util.printRecord();
				break;
			}
		}
		
		BMIUtil.releaseResource();
	}

}

/*Output: 0.Exit
1.Accept Record
2.Calculate BMI
3.printRecord
1
Height: 
1.7
Weight: 
70
0.Exit
1.Accept Record
2.Calculate BMI
3.printRecord
2
0.Exit
1.Accept Record
2.Calculate BMI
3.printRecord
3
1.7 70
BMI of a person: 24.221453
Person's weight is normal
0.Exit
1.Accept Record
2.Calculate BMI
3.printRecord
0
*/
