package com.akash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simple.xml");
		Employee emp = applicationContext.getBean(Employee.class);
		
		emp.hello();
		

	}

}
