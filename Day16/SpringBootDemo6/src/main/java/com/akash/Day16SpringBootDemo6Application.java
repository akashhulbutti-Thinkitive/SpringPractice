package com.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.akash.models.Employee;

@SpringBootApplication
public class Day16SpringBootDemo6Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Day16SpringBootDemo6Application.class, args);
		System.out.println("My First Spring Boot Demo 1");
		Employee employee = context.getBean(Employee.class);
		employee.setEmpId(34);
		employee.setEmpName("Akash");
		employee.setSalary(3000);
		System.out.println(employee);
	}

}
