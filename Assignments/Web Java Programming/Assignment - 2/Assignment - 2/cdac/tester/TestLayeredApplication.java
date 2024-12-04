package com.cdac.tester;

import java.sql.Date;
import java.util.Scanner;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

public class TestLayeredApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1. create DAO instance
			UserDao userDao = new UserDaoImpl();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options - 1. Fetch Users By Role\n" + "2. enter details for resistration\n"+"3. update Password\n"+"4. Delete User\n"+"5. Signin user\n" + "0. Exit");
				System.out.println("Choose Option");
				System.out.println("");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter role name");
						userDao.fetchUserDetailsByRole(sc.next())
						.forEach(System.out::println);
						break;
					case 2: // Register Voter
					    System.out.println("Enter voter details: First Name, Last Name, Email, Password, DOB (yyyy-mm-dd)");
					    User voter = new User(sc.next(), sc.next(), sc.next(), sc.next(), Date.valueOf(sc.next()));

					    String registrationResult = userDao.registerVoter(voter);
					    System.out.println(registrationResult);
					    break;

//					case 2 : System.out.println("Enter voter details - "
//							+ "firstName,  lastName,  email,  password,  "
//							+ "dob(yr-mon-day)");
//					//create voter
//					User voter=new User(sc.next(), sc.next(), sc.next(),
//							sc.next(),Date.valueOf(sc.next()));
//					//invoke dao's method
//					System.out.println(userDao.registerVoter(voter));
					
					//break;
//					case 3: // Update password
//                        System.out.println("Enter email,new password, old password:");
//                        String email = sc.next();
//                        String oldPassword = sc.next();
//                        String newPassword = sc.next();
//                        
//                        // Call updateVoter to change the password
//                        String result = userDao.changePassword(email, newPassword ,oldPassword);
//                        System.out.println(result);
//                        break;
					case 3:

						System.out.println("Enter Email, Enter New Password, Enter Old Password"); 
						userDao.changePassword(sc.next(), sc.next(), sc.next());

						break;
					
					case 4: // Delete User
                         System.out.println("Enter the voter ID to delete:");
                         int voterId = sc.nextInt();
                         System.out.println(userDao.DeleteVoter(voterId)); // Call deleteVoter method
                         break;
					case 5:
						System.out.println("Enter Email Password");
						System.out.println(userDao.SigninVoter(sc.next(),sc.next()));
						break;

					case 0:
						exit = true;
						userDao.cleanUp();
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					sc.nextLine();//to clear the tokens from the scanner.
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("main app over....");

	}

}
