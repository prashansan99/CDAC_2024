package com.cdac.dao;

import java.sql.SQLException;
import java.util.List;

import com.cdac.pojos.User;

public interface UserDao {
//add a method to fetch user details by role
	List<User>   fetchUserDetailsByRole(String role) throws SQLException;
//add method for voter registration
	String registerVoter(User newVoter) throws SQLException;
	//update method for update password
	//String updatePassword(String email, String oldPassword, String newPassword) throws SQLException;
	String changePassword(String email, String newPassword, String oldPassword) throws SQLException;
	// delete method for voter
	String DeleteVoter(int id) throws SQLException;
	//signin 
	String SigninVoter(String email, String Password) throws SQLException;
	//add a method to clean up DB resources;
	void cleanUp() throws SQLException;
	
}
