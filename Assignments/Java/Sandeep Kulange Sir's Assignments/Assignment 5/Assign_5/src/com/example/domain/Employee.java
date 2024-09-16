package com.example.domain;

public class Employee {
	
	private int empid;
	private String name;
	private float Salary;
	public static int totalNoofEmployees;
	
	public Employee(){
		
		totalNoofEmployees++;
	}
	
	public Employee(int id, String s, float salary) {
		this.empid=id;
		this.name=s;
		this.Salary=salary;
			
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee[Empid: "+this.empid+"Name: "+this.name+"Salary: "+this.Salary+"]";
	}
	
	
	
	
	

}
