package com.cdac.dao;
import java.util.Scanner;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cdac.pojos.User;
import static com.cdac.utils.DBUtils.*;

public class UserDaoImpl implements UserDao {
	private Scanner sc = new Scanner(System.in);
	//state - 
	private Connection connection;
	private PreparedStatement pst1;
	private PreparedStatement pst2;
	private PreparedStatement pst3;
	private PreparedStatement pst4;
	private PreparedStatement pst5;
	private PreparedStatement pst6;
	//ctor
	public UserDaoImpl() throws SQLException{
		// 1. Invoke DButils' method to open cn
		connection=openConnection();
		//2. Create PST
		pst1=connection.prepareStatement("select * from users where role=?");
		pst2 = connection.prepareStatement("Insert into users Values(default,?,?,?,?,?,?,?)");
		pst3 = connection.prepareStatement("Delete from users where id = ?");
		pst4 = connection.prepareStatement("Update users set password = ? where email = ? and password = ?");
		pst5 = connection.prepareStatement("Select * from users where email = ?");
		pst6 = connection.prepareStatement("Select id from users order by id desc limit 1");
		System.out.println("user dao created !");
	}

	@Override
	public String registerVoter(User newVoter) throws SQLException {
		pst2.setString(1, newVoter.getFirstName());
		pst2.setString(2, newVoter.getLastName());
		pst2.setString(3, newVoter.getEmail());
		pst2.setString(4, newVoter.getPassword());
		pst2.setDate(5, newVoter.getDob());
		pst2.setBoolean(6, newVoter.isStatus());
		pst2.setString(7, newVoter.getUserRole());
		int count  = pst2.executeUpdate();
		System.out.println(count);
		if(count == 1) {
			return "Created User";
		}
		else {
			return "Not Creater User";
		}
		
	}

	@Override
	public List<User> fetchUserDetailsByRole(String role) throws SQLException {
		//0. create empty list
		List<User> users=new ArrayList<>();
		//1. set IN param
		pst1.setString(1, role);
		//2 exec query -> process RST
		try (ResultSet rst=pst1.executeQuery()) {
			/*
			 * int userId, String firstName, String lastName, 
			 * String email, String password, Date dob, boolean status,
			String userRole
			 */
			while(rst.next()) {
				users.add(new User(rst.getInt(1),rst.getString(2),
						rst.getString(3),rst.getString(4),rst.getString(5),
						rst.getDate(6),rst.getBoolean(7),rst.getString(8))
						);
			}
		}
		return users;//dao layer rets list of selected users --> Tester
	}
	
	@Override
	public String deleteUserById(int Id) throws SQLException {
		pst3.setInt(1,Id);
		int count = pst3.executeUpdate();
		if(count == 1) {
			return "Deleted SuccessFully!!";
		}
		
		return "Unable to Delete";
	}

	@Override
	public String changePassword(String email, String password, String newPassword) throws SQLException {
		pst4.setString(1, newPassword);
		pst4.setString(2, email);
		pst4.setString(3, password);
		if(pst4.executeUpdate()==1) {
			return "Update Password Successfully!!";
		}
		return "Unable to update";
	}

	@Override
	public String deleteByEmail(String email) throws SQLException {
		pst5.setString(1, email);
		try (ResultSet rst = pst5.executeQuery()){
			rst.next();
			int id = rst.getInt(1);
			System.out.println("Are you really want to delete Account");
			System.out.println("1.Yes" + " " +"2.No");
			int choice = sc.nextInt();
			if(choice == 1) {
				String response = deleteUserById(id);
				return response;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Jaiye";
	}

	@Override
	public String deleterNewlyCreatedUser() throws SQLException {
		try(ResultSet rst = pst6.executeQuery()){
			rst.next();
			int id = rst.getInt(1);
			System.out.println("Are you really want to delete Account");
			System.out.println("1.Yes" + " " +"2.No");
			int choice = sc.nextInt();
			if(choice == 1) {
				String response = deleteUserById(id);
				return response;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "ok";
	}

	@Override
	public void cleanUp() throws SQLException {
		//close pst1
		if(pst1 != null && pst2 != null && pst3 != null)
			pst1.close();
		    pst2.close();
		    pst3.close();
		//close connection
		closeConnection();
		System.out.println("user dao cleaned up !");
		
	}
	

}
