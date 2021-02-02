package com.akash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akash.models.Employee;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.akash.models");
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);

	}

}
