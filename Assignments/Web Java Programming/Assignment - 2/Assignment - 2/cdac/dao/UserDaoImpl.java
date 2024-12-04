package com.cdac.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cdac.pojos.User;
import static com.cdac.utils.DBUtils.*;

public class UserDaoImpl implements UserDao {
	// state -
	private Connection connection;
	private PreparedStatement pst1, pst2, pst3, pst4,pst5;

	// ctor
	public UserDaoImpl() throws SQLException {
		// 1. Invoke DButils' method to open cn
		connection = openConnection();
		// 2. Create PST : it represents pre-parsed n pre-compiled statment,
		// efficient in case of repeatative queries
		pst1 = connection.prepareStatement("select * from users where role=?");
		// insert query
		pst2 = connection.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		//update Query
		pst3 = connection.prepareStatement("select password, role from users where email = ?");
		pst4 = connection.prepareStatement("update users set password = ? where email = ?");
		// delete voter
		pst5 = connection.prepareStatement("delete from users where id = ?");
		System.out.println("user dao created !");
	}

	@Override
	public List<User> fetchUserDetailsByRole(String role) throws SQLException {
		// 0. create empty list
		List<User> users = new ArrayList<>();// size=0 , init capa=10
		// 1. set IN param
		pst1.setString(1, role);
		// 2 exec query -> process RST
		try (ResultSet rst = pst1.executeQuery()) {
			/*
			 * int userId, String firstName, String lastName, String email, String password,
			 * Date dob, boolean status, String userRole
			 */
			// RST cursor -: before the 1st row
			while (rst.next()) {
				users.add(new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getString(5), rst.getDate(6), rst.getBoolean(7), rst.getString(8)));
			}
		}
		return users;// dao layer rets list of selected users --> Tester
	}
 //user resister
//	@Override
//	public String registerVoter(User newVoter) throws SQLException {
//		// 1. Read from newVoter n set IN params
//		pst2.setString(1,newVoter.getFirstName());//fn
//		pst2.setString(2,newVoter.getLastName());//ln
//		pst2.setString(3,newVoter.getEmail());//em
//		pst2.setString(4,newVoter.getPassword());//pass
//		pst2.setDate(5, newVoter.getDob());//dob
//		pst2.setBoolean(6, newVoter.isStatus());//voting status , false=> not yet voted !
//		pst2.setString(7, newVoter.getUserRole());//role
//	    //exec query - exec update - DDL | DML
//		/*
//		 * public int executeUpdate() throws SQLException
//		 */
//		int updateCount=pst2.executeUpdate();
//		if(updateCount ==1)
//			return "User registered !";
//		return "User registration failed!!!!!!";
//	}
	@Override
	public String registerVoter(User newVoter) throws SQLException {
	    // Calculate age based on DOB
	    long ageInMillis = System.currentTimeMillis() - newVoter.getDob().getTime();
	    int age = (int) (ageInMillis / (1000L * 60 * 60 * 24 * 365));

	    if (age < 21) {
	        return "Registration failed: Age must be greater than 21.";
	    }

	    // Set input parameters
	    pst2.setString(1, newVoter.getFirstName());
	    pst2.setString(2, newVoter.getLastName());
	    pst2.setString(3, newVoter.getEmail());
	    pst2.setString(4, newVoter.getPassword());
	    pst2.setDate(5, newVoter.getDob());
	    pst2.setBoolean(6, newVoter.isStatus());
	    pst2.setString(7, newVoter.getUserRole());

	    // Execute update
	    int updateCount = pst2.executeUpdate();
	    if (updateCount == 1) {
	        return "User registered successfully!";
	    }

	    return "Registration failed!";
	}

	

//	@Override
//	public String updatePassword(String email, String oldPassword, String newPassword) throws SQLException {
//		// TODO Auto-generated method stub
//		 // Step 1: Verify email and old password
//	    String verifyQuery = "SELECT * FROM users WHERE email = ? AND password = ?";
//	    try (PreparedStatement verifyPst = connection.prepareStatement(verifyQuery)) {
//	        verifyPst.setString(1, email);
//	        verifyPst.setString(2, oldPassword);
//	        try (ResultSet rst = verifyPst.executeQuery()) {
//	            if (rst.next()) { // User exists with given email and old password
//	                // Step 2: Update password
//	                String updateQuery = "UPDATE users SET password = ? WHERE email = ?";
//	                try (PreparedStatement updatePst = connection.prepareStatement(updateQuery)) {
//	                    updatePst.setString(1, newPassword); // Set new password
//	                    updatePst.setString(2, email);       // Set email
//	                    int rowsAffected = updatePst.executeUpdate();
//	                    if (rowsAffected > 0) {
//	                        return "Password updated successfully!";
//	                    }
//	                }
//	            } else {
//	                return "Invalid email or old password!";
//	            }
//	        }
//	    }
//	    return "Password update failed!";
//	}
	// update user details
	@Override
	public String changePassword(String email, String newPassword, String oldPassword) throws SQLException {
		pst3.setString(1, email);
		
		try(ResultSet rst = pst3.executeQuery()){
			//System.out.println("inside change password");
			if(rst.next()) {
				String oldPW = rst.getString("password");
				//System.out.println(oldPW);
				if(oldPW.equals(oldPassword)) {
					pst4.setString(1, newPassword);
					pst4.setString(2, email);
					
					int updateCount = pst4.executeUpdate();
					if(updateCount == 1)
					System.out.println("Password Updated!!");	
				}else {
				System.out.println("Password Incorrect!!");
				}
			}else {
				System.out.println("Invaild Email!!");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("enternal error");
		}
		
		return "Password Updation Failed!!";
	}
	//delete
//	@Override
//	public String DeleteVoter(int id) throws SQLException {
//	    // SQL query to delete a user by ID
//	    String query = "DELETE FROM users WHERE id = ?";
//
//	    // Prepare the statement
//	    try (PreparedStatement pst5 = connection.prepareStatement(query)) {
//	        // Set the ID parameter in the prepared statement
//	        pst5.setInt(1, id);
//	        // Execute the delete operation
//	        int rowsAffected = pst5.executeUpdate();
//
//	        // Check if any row was deleted
//	        if (rowsAffected > 0) {
//	            return "User deleted successfully.";
//	        } else {
//	            return "User with the given ID not found.";
//	        }
//	    } catch (SQLException e) {
//	        // Handle any exceptions (e.g., connection issues or SQL errors)
//	        return "Error occurred while deleting user: " + e.getMessage();
//	    }
//	}
	@Override
	public String DeleteVoter(int id) throws SQLException {
		pst5.setInt(1, id);
		try{
			int updateCount = pst5.executeUpdate();
			if(updateCount ==1) {
				//System.out.println("voter deleted");
				return "user deleted";
			}
	
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("error");
			
		}
		
		return "invalid deleted";
		
	}
	//signin
	
	@Override
	public String SigninVoter(String email, String Password) throws SQLException {
		// TODO Auto-generated method stub
		pst3.setString(1, email);
		//ResultSet rst = pst3.executeQuery();
		try (ResultSet rst = pst3.executeQuery()){
			if(rst.next()) {
				String pw = rst.getString("password");
				if(pw.equals(Password)) {
					return rst.getString("role");
				}else {
					return "password incoreect";
				}			
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("error");
			
		}
		return "Envalid Email!!";
	}
		
	@Override
	public void cleanUp() throws SQLException {
		// close pst1
		if (pst1 != null)
			pst1.close();
		// close pst2
		if (pst2 != null)
			pst2.close();
		// close pst3
		if (pst3 != null)
			pst3.close();
		//close pst4
		if (pst4 != null)
			pst4.close();
		//close pst5
		if (pst5 != null)
			pst5.close();
		// close connection
		closeConnection();
		System.out.println("user dao cleaned up !");

	}
	
}
