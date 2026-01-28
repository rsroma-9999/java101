package com.bpi.ph.m5.act3;

import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class M5Act3 {
	
	 // connect to database
	 private static final String url = "jdbc:postgresql://localhost:5432/training_db";
	 private static final String username = "rmsroma";
	 private static final String password = "";
	    
	 public static void main( String[] args ) {
		 Scanner scanner = new Scanner(System.in);	  
		 
		 int options = -1;
	        
		 while (options != 0) {
		     System.out.println("===== STUDENT COURSE MANAGEMENT =====");
			 System.out.println("1. Add Student");
			 System.out.println("2. Add Course");
			 System.out.println("3. Show Students");
			 System.out.println("4. Show Courses");
			 System.out.println("0. Exit");
			 System.out.print("Choose an option: ");
			 
			 // option not numeric
			 while (!scanner.hasNextInt()) {
				 System.out.println("Invalid Option! Enter value[0 - 4]: ");
				 scanner.next(); // consume		
				 
			 }
	 
			 options = scanner.nextInt();
			 scanner.nextLine();		
			 
			 switch (options) {
             	case 1: addStudent(scanner);
             		break;
             	case 2: addCourse(scanner);
             		break;
             	case 3: displayStudents();
             		break;
             	case 4: displayCourses();
             		break;
             	case 0: {
             		System.out.println("Exiting application. Goodbye!");
             		return;
             	}   
             	default: System.out.println("Invalid Option! Enter value[0 - 4]. \n");
			 }	 
		 } 
	 }
		 
	 // option 1 add student
	 private static void addStudent(Scanner scanner) {
	    	
	    try (Connection conn = DriverManager.getConnection(url, username, password)) {

	         System.out.print("Enter name: ");
	         String name = scanner.nextLine();
	         System.out.print("Enter age: ");
	         int age = scanner.nextInt();
	         scanner.nextLine();
	         System.out.print("Enter email: ");
	         String email = scanner.nextLine();
	         String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1, name);
	         ps.setInt(2, age);
	         ps.setString(3, email);
	         ps.executeUpdate();
	         System.out.println("Student added successfully!\n");
	         
	     } catch (Exception e) {
	          System.out.println("Error adding student: " + e.getMessage());
	     } 
	 }	
			 
	// option 2 add course
	private static void addCourse(Scanner scanner) {
	     
		 try (Connection conn = DriverManager.getConnection(url, username, password)) {

	          System.out.print("Enter student ID: ");
	          int studentId = scanner.nextInt();
	          scanner.nextLine();
	          System.out.print("Enter course name: ");
	          String courseName = scanner.nextLine();
	          System.out.print("Enter grade: ");
	          double grade = scanner.nextDouble();
	          scanner.nextLine();
	          String sql = "INSERT INTO courses (student_id, course_name, grade) VALUES (?, ?, ?)";
	          PreparedStatement ps = conn.prepareStatement(sql);
	          ps.setInt(1, studentId);
	          ps.setString(2, courseName);
	          ps.setDouble(3, grade);
	          ps.executeUpdate();
	          System.out.println("Course added successfully!\n");

	        } catch (Exception e) {
	             System.out.println("Error adding course: " + e.getMessage());
	        } 
		 
	 }  
	    
	// option 3 display all students
    private static void displayStudents() {
    	
        String sql = "SELECT id, name, age, email FROM students ORDER BY id";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
             System.out.println("\nID | Name | Age | Email");
             System.out.println("------------------------------------");
            
             while (rs.next()) {
       	                System.out.println(rs.getInt("id") +
                        " | " + rs.getString("name") +
                        " | "  + rs.getInt("age") +
                        " | "  + rs.getString("email"));
             }
             System.out.println();
             
        } catch (Exception e) {
            System.out.println("Error displaying students: " + e.getMessage());
        }
        
     }
	 
    // option 4 display all courses 
    private static void displayCourses() {
        String sql = """
                SELECT a.id, a.course_name, a.grade,
                       b.name AS student_name
                FROM courses a
                JOIN students b ON a.student_id = b.id
                ORDER BY a.id;
        			""";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

        		System.out.println("\nID | Course | Grade | Student Name");
        		System.out.println("------------------------------------");
        		
        		while (rs.next()) {
        			System.out.println(rs.getInt("id") +
                		" | "  + rs.getString("course_name") +
                		" | "  + rs.getDouble("grade") +
                		" | "  + rs.getString("student_name"));
        		}
        		System.out.println();
        		
        	} catch (Exception e) {
        		System.out.println("Error displaying courses: " + e.getMessage());
        	}
        
    }
    
}
	 