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
			UserDao userDao = new UserDaoImpl();//upcasting
			boolean exit = false;
			while (!exit) {
				System.out.println("Options - 1. Fetch Users By Role\n" + "0. Exit");
				System.out.println("Options - 2. Create Voter");
				System.out.println("Options - 3.Delete User By Id");
				System.out.println("Options - 4.for Update the pass");
				System.out.println("Options - 5.for Delete using Email");
				System.out.println("Options - 6.for newly Created User");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 2:
						System.out.println("User Details "+"FirstName , LastName , Email ,Password"
					+ "DOB-> yy-mm-dd");
						User voter = new User(sc.next(),sc.next(),sc.next(),sc.next(),Date.valueOf(sc.next()));
						System.out.println(userDao.registerVoter(voter));
						break;
					case 1:
						System.out.println("Enter role name");
						userDao.fetchUserDetailsByRole(sc.next())
						.forEach(System.out::println);
						break;
					case 3:
						System.out.println("Enter your email , password and new password");
						System.out.println(userDao.deleteUserById(sc.nextInt()));
						break;
					case 4:
						System.out.println("Enter email , password , newPassword");
						System.out.println(userDao.changePassword(sc.next(), sc.next(), sc.next()));
						break;
					case 5:
						System.out.println("Enter email");
						System.out.println(userDao.deleteByEmail(sc.next()));
						break;
					case 6:
						System.out.println(userDao.deleterNewlyCreatedUser());
						break;
					case 0:
						exit = true;
						userDao.cleanUp();
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
