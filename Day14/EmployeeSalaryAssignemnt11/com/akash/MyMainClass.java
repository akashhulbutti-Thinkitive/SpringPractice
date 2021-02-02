package com.akash;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akash.configurationclass.ConfigurationClass;
import com.akash.models.Employee;

public class MyMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.akash.configurationclass");
		context.register(ConfigurationClass.class);
		Employee emp = context.getBean(Employee.class);
		
		System.out.println(emp);


	}

}
