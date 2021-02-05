package com.akash.Da16_SringMVCHibernateEmployeeCrud3.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.akash.Da16_SringMVCHibernateEmployeeCrud3.models.Employee;

public class EmployeeDaoImpl {
	
	public EmployeeDaoImpl() {
	}

	public void saveEmployee(Employee emp) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		factory.close();
	}

	public void updateEmployee(Employee emp) {

		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(emp);
		tx.commit();
		session.close();
		factory.close();
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
	
	public void deleteEmployee(int id) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		Employee emp =new Employee(id, null, 0);
		session.delete(emp);
		tx.commit();
		session.close();
		factory.close();
		
	}
	
	public Employee getSingleRecords(Integer empid) {
		Employee emp=null;
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		String hql = "from Employee e where e.empid= :empid";    
		Query query = session.createQuery(hql);
		query.setParameter("empid", empid);
		query.setMaxResults(1);
		emp = (Employee) query.uniqueResult();
		System.out.println("Single Record : "+emp);
		tx.commit();
		session.close();
		factory.close();
		return emp;
		
	}
	
}
