package com.cdac.pojos;
/*
 * id | first_name | last_name | email             | password 
 * | dob        | status | role
 */



public class Student {
	private int id;
	private String name;
	private int age;
	private String grade;
	private String email;

	// def ctor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, String grade, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.email = email;
	}

	public Student(String name, int age, String grade, String email) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGrade() {
		return grade;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
	    return String.format("| %-4d | %-10s | %-3d | %-6s | %-20s |", 
	                         id, name, age, grade, email);
	}


}
