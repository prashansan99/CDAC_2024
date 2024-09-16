package com.example.util;

import java.util.Scanner;

import com.example.domain.Employee;

public class EmployeeUtil {
	
	private Employee e1;
	float Raise, totalSalary;
	
	public EmployeeUtil() {
		
		
	}
	
	private static Scanner sc= new Scanner(System.in);
	public void acceptRecord()
	{
		this.e1= new Employee();	
		System.out.println("Empid: ");
		this.e1.setEmpid(sc.nextInt());
		sc.nextLine();
		System.out.println("Name: ");
		this.e1.setName(sc.nextLine());
		System.out.println("Salary: ");
		this.e1.setSalary(sc.nextFloat());
	}
	
	public void applyRaise(double r) {
		Raise= (float) (e1.getSalary()*r);
		System.out.println("Raised amount of the Salary: Rs. "+Raise);
		
	}
	
	public void totalSalary() {
		totalSalary= e1.getSalary()+Raise;
		System.out.println("Salary after the raise: "+totalSalary);
		
	}
	public void updateSalary()
	{
		//this.totalSalary=(float) ns;
		System.out.println("Updated Salary: "+ this.totalSalary);
		
	}
	
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Apply Raise");
		System.out.println("3.Total salary");
		System.out.println("4.Updated Salary");
		System.out.print("Enter choice: ");
		return sc.nextInt();
	

	}
	
	public static void releaseResource() {
		sc.close();
	}
}