package com.example.main;

import com.example.domain.Employee;
import com.example.util.EmployeeUtil;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		EmployeeUtil util= new EmployeeUtil();
		while((choice= EmployeeUtil.menuList())!=0)
		{
			switch(choice) {
			case 1:
				util.acceptRecord();
				break;
			case 2:
				util.applyRaise(5);
				break;
			case 3: 
				util.totalSalary();
				break;
			case 4: 
				util.updateSalary();
				break;
				
			}
			
		}
		
		System.out.println("Number of Objects created: "+Employee.totalNoofEmployees);
		EmployeeUtil.releaseResource();
	}

}
