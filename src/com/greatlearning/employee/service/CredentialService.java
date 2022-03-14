package com.greatlearning.employee.service;

import com.greatlearning.employee.model.Employee;
import com.greatlearning.employee.util.PasswordGenerator;

public class CredentialService {

	PasswordGenerator pass = new PasswordGenerator();

	String emailAddress;
	String Password = pass.generatePassword();


	public String generateEmailAddress(Employee emp) {

		emailAddress = emp.getFirstName() + emp.getLastName() + "@" + emp.getDepartment() + ".company.com";

		return emailAddress;

	}

	public String showCredentials(Employee emp) {

		generateEmailAddress(emp);

		String genCredentials = "Dear " + emp.getFirstName() + " " + "your generated credentials are as follows"
				+ "\nEmail ---> " + emailAddress + "\nPassword ---> " + Password;
		
		return genCredentials;

	}

}
