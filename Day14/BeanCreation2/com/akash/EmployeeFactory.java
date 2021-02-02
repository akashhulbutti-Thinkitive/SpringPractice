package com.akash;

public class EmployeeFactory {
	
	public Employee getInstance() {
		System.out.println("Bean Instantiated via Bean Factory Provider Class");
		return new Employee();
	}

}
