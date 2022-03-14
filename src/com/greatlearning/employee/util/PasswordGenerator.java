package com.greatlearning.employee.util;

public class PasswordGenerator {
	
	public static String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";

	// Generate Password of length 8
	public String generatePassword() {
		
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

}
