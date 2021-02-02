package com.akash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sample.xml");
		Employee emp = applicationContext.getBean("emp",Employee.class);
		Address add = applicationContext.getBean("address",Address.class);
		
		System.out.println(emp);
	}
}
