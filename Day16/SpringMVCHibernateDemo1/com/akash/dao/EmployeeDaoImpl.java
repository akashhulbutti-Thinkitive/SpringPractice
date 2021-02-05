package com.akash.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.akash.models.Employee;

public class EmployeeDaoImpl {
	public EmployeeDaoImpl() {
	}

	public List showListEmployee() {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		List<Employee> list = session.createCriteria(Employee.class).list();
		  for(Employee e:list)
		  System.out.println(e.getEmpid()+" : "+e.getEname()+" : "+e.getSalary());
		 
		tx.commit();
		session.close();
		factory.close();
		return list;
	}
	
}
