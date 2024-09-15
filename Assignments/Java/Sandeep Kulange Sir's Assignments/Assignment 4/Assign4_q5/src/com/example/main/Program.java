package com.example.main;

import com.example.TollUtil.TollUtil;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		TollUtil util= new TollUtil();
		while((choice= TollUtil.menuList())!=0)
		{
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
		TollUtil.releaseResource();
	}

}

/*Output: 
 0.Exit
1.Accept Record
2.Calculate Record
3.Print Record
1
Toll of Car: 
50
Toll of Truck: 
100
Toll of Motorcycle: 
30
No of Cars: 
3
No of Trucks: 
3
No of Motorcycles: 
2
0.Exit
1.Accept Record
2.Calculate Record
3.Print Record
2
0.Exit
1.Accept Record
2.Calculate Record
3.Print Record
3
3 3 2 50.0 100.0 30.0
Total Revenue of cars: 150.0 Total Revenue of Trucks: 300.0Total Revenue of Motorcycles: 60.0
0.Exit
1.Accept Record
2.Calculate Record
3.Print Record
*/
