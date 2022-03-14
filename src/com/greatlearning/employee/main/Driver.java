package com.greatlearning.employee.main;

import java.util.Scanner;

import com.greatlearning.employee.model.Employee;
import com.greatlearning.employee.service.CredentialService;

public class Driver {

	// Scanner to take user input
	private static final Scanner sc = new Scanner(System.in);
	private static final CredentialService service = new CredentialService();
	public static String firstName;
	public static String lastName;
	public static String department;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Employee emp = null;
		System.out.print("Enter First Name : ");
		firstName = sc.nextLine();
		System.out.print("Enter Last Name : ");
		lastName = sc.nextLine();

		int choice = 0;

		choice = showDepartments();
		switch (choice) {
		case 1:
			department = "Technical";
			break;
		case 2:
			department = "Admin";
			break;
		case 3:
			department = "Human Resource";
			break;
		case 4:
			department = "Legal";
			break;

		default:
			System.out.println("Invalid Employee Details: Exit the Program");
			// sc.close();
		}

		emp = new Employee(firstName, lastName, department);

		System.out.println(
				"Show the Generated Credentials for employee: " + emp.getFirstName() + " " + emp.getLastName());
		String genCreds = service.showCredentials(emp);
		System.out.println(genCreds);
		System.out.println("***********************");

	}

	private static int showDepartments() {
		System.out.println("----- Department List -------");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("------- Enter the choice from list ---------");
		return sc.nextInt();
	}

}
