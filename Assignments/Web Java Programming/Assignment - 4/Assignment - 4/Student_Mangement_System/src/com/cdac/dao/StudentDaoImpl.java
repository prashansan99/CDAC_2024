package com.cdac.dao;
import java.sql.*;
import java.util.*;
import com.cdac.pojos.Student;
import static com.cdac.utils.DBUtils.*;


public class StudentDaoImpl implements StudentDao {
	// state -
	private Connection connection;
	private PreparedStatement pst1;
	private PreparedStatement pst2;
	private PreparedStatement pst3;
	private PreparedStatement pst4;
	private PreparedStatement pst5;
	private PreparedStatement pst6;

	// ctor
	public StudentDaoImpl() throws SQLException {
		// 1. Invoke DButils' method to open cn
		connection = openConnection();
		// 2. Create PST
		pst1 = connection.prepareStatement("select * from students");
		pst2 = connection.prepareStatement("insert into students values(default,?,?,?,?)");
		pst3 = connection.prepareStatement("update students set name=?, age=?, grade=?, email=? where id=?");
		pst4 = connection.prepareStatement("delete from students where id=?");
		pst5 = connection.prepareStatement("select * from students where name=?");
		pst6 = connection.prepareStatement("select * from students where email=?");
		System.out.println("user dao created !");
	}

	@Override
	public List<Student> fetchStudentDetails() throws SQLException {
		// 0. create empty list
		List<Student> student = new ArrayList<>();
		// 1. set IN param
		// 2 exec query -> process RST
		try (ResultSet rst = pst1.executeQuery()) {
			/*
			 * int userId, String firstName, String lastName, String email, String password,
			 * Date dob, boolean status, String userRole
			 */
			while (rst.next()) {
				student.add(new Student(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4),
						rst.getString(5)));
			}
		}
		return student;// dao layer rets list of selected users --> Tester
	}

	@Override
	public String registerStudent(Student newStudent) throws SQLException {
		pst2.setString(1, newStudent.getName());
		pst2.setInt(2, newStudent.getAge());
		pst2.setString(3, newStudent.getGrade());
		pst2.setString(4, newStudent.getEmail());

		try {
			int updateCount = pst2.executeUpdate();
			if (updateCount == 1)
				return "student Regitered Sucessfully!";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Student Registration Failed!";
	}

	@Override
	public String UpdateStudentDetails(int id, String name, int age, String grade, String email) throws SQLException {
		pst3.setString(1, name);
		pst3.setInt(2, age);
		pst3.setString(3, grade);
		pst3.setString(4, email);
		pst3.setInt(5, id);
		try {
			int updateCount = pst3.executeUpdate();
			if (updateCount == 1) {
				return "Student updated sucessfully";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Student Updation Failed!";
	}

	@Override
	public List<Student> searchbyName(String name) throws SQLException {
		// 0. create empty list
		List<Student> student1 = new ArrayList<>();
		// 1. set IN param
		pst5.setString(1, name);
		// 2 exec query -> process RST
		try (ResultSet rst = pst5.executeQuery()) {
			/*
			 * int userId, String firstName, String lastName, String email, String password,
			 * Date dob, boolean status, String userRole
			 */
			while (rst.next()) {
				student1.add(new Student(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4),
						rst.getString(5)));
			}
		}
		return student1;// dao layer rets list of selected users --> Tester
	}

	@Override
	public List<Student> searchbyEmail(String email) throws SQLException {
		// 0. create empty list
		List<Student> student1 = new ArrayList<>();
		// 1. set IN param
		pst6.setString(1, email);
		// 2 exec query -> process RST
		try (ResultSet rst = pst6.executeQuery()) {
			/*
			 * int userId, String firstName, String lastName, String email, String password,
			 * Date dob, boolean status, String userRole
			 */
			while (rst.next()) {
				student1.add(new Student(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4),
						rst.getString(5)));
			}
		}
		return student1;// dao layer rets list of selected users --> Tester
	}

	@Override
	public String deleteStudent(int id) throws SQLException {
		pst4.setInt(1, id);
		try {
			int updateCount = pst4.executeUpdate();
			if (updateCount == 1) {
				return "Student Deleted Sucessfully";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Student Deletion Failed";
	}

	@Override
	public void cleanUp() throws SQLException {
		// close pst1
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		if (pst4 != null)
			pst4.close();
		if (pst5 != null)
			pst5.close();

		// close connection
		closeConnection();
		System.out.println("user dao cleaned up !");

	}

}
