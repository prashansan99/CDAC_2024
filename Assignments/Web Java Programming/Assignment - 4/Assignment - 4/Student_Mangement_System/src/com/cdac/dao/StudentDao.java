package com.cdac.dao;

import java.sql.SQLException;
import java.util.List;

import com.cdac.pojos.Student;

public interface StudentDao {
//add a method to fetch user details by role
	List<Student>   fetchStudentDetails() throws SQLException;
	
	//add a method to user registration
	
	String registerStudent(Student newStudent) throws SQLException;
	
	String UpdateStudentDetails(int id, String name, int age, String grade, String email) throws SQLException;
	
	List<Student> searchbyName(String name) throws SQLException;
	
	List<Student> searchbyEmail(String email) throws SQLException;
	
	String deleteStudent(int id) throws SQLException;
	
	
	
	//add a method to clean up DB resources;
	void cleanUp() throws SQLException;
}
