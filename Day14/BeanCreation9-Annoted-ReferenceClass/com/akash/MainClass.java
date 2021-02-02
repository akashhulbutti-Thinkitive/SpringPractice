package com.akash;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akash.configurationclass.ConfigurableClass;
import com.akash.models.Address;
import com.akash.models.Employee;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.akash.configurationclass");
		context.register(ConfigurableClass.class);
//		context.refresh();
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
		
		Address add = context.getBean(Address.class);
		System.out.println(add.toString());
		

		
	}
}
