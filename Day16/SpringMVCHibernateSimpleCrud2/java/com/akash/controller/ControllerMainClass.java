package com.akash.controller;

import java.util.Scanner;

import com.akash.dao.EmployeeDaoImpl;
import com.akash.models.Employee;

public class ControllerMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("********* Menu *********");
			System.out.println("\t 1 : Add Employee");
			System.out.println("\t 2 : View Employee");
			System.out.println("\t 3 : Update Employee");
			System.out.println("\t 4 : Delete Employee");
			System.out.println("\t 5 : Exit");
			System.out.print("\n Enter Your Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				new EmployeeDaoImpl().saveEmployee(new Employee(9897,"JOJO",6700));
				System.out.println("Employee Saved");
				break;
			case 2:
				new EmployeeDaoImpl().showListEmployee();
				break;
			case 3:
				new EmployeeDaoImpl().updateEmployee(new Employee(9897,"Updated JoJO",76000));;
				System.out.println("Update");
				break;
			case 4:
				new EmployeeDaoImpl().deleteEmployee(9897);
				System.out.println("Eployee Deleted");
				break;
			}
		} while (choice != 5);

	}

}
