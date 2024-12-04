package com.cdac.tester;

import java.util.Scanner;
import com.cdac.dao.StudentDao;
import com.cdac.dao.StudentDaoImpl;
import com.cdac.pojos.Student;

public class TestLayeredApplication {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Create DAO instance
            StudentDao studentDao = new StudentDaoImpl();
            boolean exit = false;

            // Menu-driven program
            while (!exit) {
                System.out.println("\n======== Student Management System ========");
                System.out.println("1. Register Student");
                System.out.println("2. Update Student");
                System.out.println("3. Search Student by Name");
                System.out.println("4. Search Student by Email");
                System.out.println("5. Delete Student");
                System.out.println("6. View All Students");
                System.out.println("0. Exit");
                System.out.println("===========================================");
                System.out.print("Choose an option: ");

                try {
                    switch (sc.nextInt()) {
                        case 1: // Register Student
                            System.out.println("Enter Student Details (name, age, grade, email):");
                            Student newStudent = new Student(
                                    sc.next(), 
                                    sc.nextInt(), 
                                    sc.next(), 
                                    sc.next());
                            System.out.println(studentDao.registerStudent(newStudent));
                            break;

                        case 2: // Update Student
                            System.out.println("Enter Student Details (id, name, age, grade, email):");
                            System.out.println(studentDao.UpdateStudentDetails(
                                    sc.nextInt(), 
                                    sc.next(), 
                                    sc.nextInt(), 
                                    sc.next(), 
                                    sc.next()));
                            break;

                        case 3: // Search by Name
                            System.out.print("Enter Name to Search: ");
                            String name = sc.next();
                            System.out.println("Search Results:");
                            studentDao.searchbyName(name).forEach(System.out::println);
                            break;

                        case 4: // Search by Email
                            System.out.print("Enter Email to Search: ");
                            String email = sc.next();
                            System.out.println("Search Results:");
                            studentDao.searchbyEmail(email).forEach(System.out::println);
                            break;

                        case 5: // Delete Student
                            System.out.print("Enter Student ID to Delete: ");
                            int idToDelete = sc.nextInt();
                            System.out.println(studentDao.deleteStudent(idToDelete));
                            break;

                        case 6: // View All Students
                            System.out.println("All Students:");
                            studentDao.fetchStudentDetails().forEach(System.out::println);
                            break;

                        case 0: // Exit
                            System.out.println("Exiting... Thank you!");
                            studentDao.cleanUp();
                            exit = true;
                            break;

                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                    sc.nextLine(); // Clear the input buffer
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
