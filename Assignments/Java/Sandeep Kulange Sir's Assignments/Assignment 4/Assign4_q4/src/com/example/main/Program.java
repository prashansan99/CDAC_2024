package com.example.main;

import com.example.DiscountUtil.DiscountUtil;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		DiscountUtil d1= new DiscountUtil();
		while((choice= DiscountUtil.menuList())!=0) {
			switch(choice) {
			case 1:
				d1.acceptrecord();
				break;
				
			case 2:
				d1.calculate();
				break;
			case 3:
				d1.printRecord();
				break;
				
				
			}
		}
		
		DiscountUtil.releaseResource();
	}

}

/*Output: 0.Exit
1.Accept Record
2.Calculate
3.Print Record
1
Original Price: 5000
Discount Percentage: 
10
0.Exit
1.Accept Record
2.Calculate
3.Print Record
2
0.Exit
1.Accept Record
2.Calculate
3.Print Record
3
5000.0 10.0
Discounted Amount: 500.0
Final Price: 4500.0
0.Exit
1.Accept Record
2.Calculate
3.Print Record
*/
