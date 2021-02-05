package com.akash;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akash.models.Employee;

@SpringBootApplication
public class Day16SpringBootMvcDemo71Application {

	public static void main(String[] args) {
	//	SpringApplication.run(Day16SpringBootMvcDemo71Application.class, args);
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		session.save(new Employee(123, 55000,"temp name"));
		//  System.out.println(e.getEmpid()+" : "+e.getEname()+" : "+e.getSalary());
		 
		tx.commit();
		session.close();
		factory.close();
	}

}
