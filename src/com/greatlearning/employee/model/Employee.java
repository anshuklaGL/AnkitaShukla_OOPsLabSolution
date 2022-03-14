package com.greatlearning.employee.model;

public class Employee {
	
	private String firstName;
    private String lastName;
    private String department;
    
    public Employee(String fname, String lname, String dept) {
    	
    	this.firstName=fname;
    	this.lastName=lname;
    	this.department=dept;
    }

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
