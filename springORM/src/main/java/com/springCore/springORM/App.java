package com.springCore.springORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.springORM.dao.StudentDao;
import com.springCore.springORM.entites.Student;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// Student student=new Student(41, "Pranav", "Pune");
//    int r = studentDao.insert(student);
//    
//    System.out.println("DONE "+r);
//    

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean go = true;
		while (go) {

			System.out.println("Press 1 for Adding new student");
			System.out.println("Press 2  display all student");
			// System.out.println("Press1 for Adding new student");
			System.out.println("Press 3 for display single student");
			System.out.println("Press 4 delete student ");
			System.out.println("Press 5 update  student");
			System.out.println("Press 6 exits");

			try {
				int input = Integer.parseInt(br.readLine());
				Scanner sc = new Scanner(System.in);

				switch (input) {
				case 1:
					// adding new student
					System.out.println("Enter  unique student ID");
					int id = sc.nextInt();
					sc.nextLine();

					System.out.println("Enter  student City");
					String city = sc.nextLine();

					System.out.println("Enter  student name");
					String name = sc.nextLine();

					Student s = new Student(id, name, city);
					int result = studentDao.insert(s);
					System.out.println(name + " record added successfully");

					break;

				case 2:
					// Display All students
					List<Student> allStudents = studentDao.getAllStudents();
					System.out.println(allStudents);
					break;
				case 3:
					// display single student
					System.out.println("Enter  unique student ID");
					int id1 = sc.nextInt();
					sc.nextLine();
					Student student1 = studentDao.getStudent(id1);
					System.out.println(student1);

					break;
				case 4:
					// delete student
					System.out.println("Enter   student ID to delete  her/his record");
					int id2 = sc.nextInt();
					sc.nextLine();
					studentDao.delete(id2);
					System.out.println(id2 + "record deleted");
					break;
				case 5:
					// update student
					System.out.println("Enter student ID to update the record");
					int idToUpdate = sc.nextInt();
					sc.nextLine(); // Consume newline character

					Student exitingStudent = studentDao.getStudent(idToUpdate);

					// Prompt user for update options
					System.out.println("Which field(s) do you want to update?");
					System.out.println("1. Name");
					System.out.println("2. City");
					System.out.println("3. Both");
					int option = sc.nextInt();
					sc.nextLine(); // Consume newline character

					String newName = exitingStudent.getName();
					String newCity = exitingStudent.getCity();

					switch (option) {
					case 1:
						System.out.println("Enter new name for the student");
						newName = sc.nextLine();

						break;
					case 2:
						System.out.println("Enter new city for the student");
						newCity = sc.nextLine();

						break;
					case 3:
						System.out.println("Enter new name for the student");
						newName = sc.nextLine();
						System.out.println("Enter new city for the student");
						newCity = sc.nextLine();
						break;
					default:
						System.out.println("Invalid option. No changes will be made.");
						break;
					}

					// Create Student object with updated information
					Student updatedStudent = new Student(idToUpdate, newName, newCity);
					int updateResult = studentDao.updateStudent(updatedStudent);
					if (updateResult > 0) {
						System.out.println(newName + " Record updated successfully");
					} else {
						System.out.println("Failed to update record");
					}
					break;
				case 6:
					// exit
					go = false;
					break;

				default:
					break;
				}

			} catch (Exception e) {
				System.out.println("Invalid input");
				// System.out.println(e.getMessage());
			}
		}
		System.out.println("Successfully Exits!!!");
	}
}
