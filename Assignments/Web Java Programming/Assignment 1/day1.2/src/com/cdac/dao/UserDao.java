package com.cdac.dao;

import java.sql.SQLException;
import java.util.List;

import com.cdac.pojos.User;

public interface UserDao {
//add a method to fetch user details by role
	List<User>   fetchUserDetailsByRole(String role) throws SQLException;
	String registerVoter(User newVoter) throws SQLException;
	//Deleting the user by Id
	String deleteUserById(int Id) throws SQLException;
	//add a method to clean up DB resources;
	String changePassword(String email, String password, String newPassword)throws SQLException;
	String deleteByEmail(String email)throws SQLException;
	String deleterNewlyCreatedUser()throws SQLException;
	void cleanUp() throws SQLException;
}
