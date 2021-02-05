package com.akash.Day16_SpringMVCHIbernateDictionaryAssignment4.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.akash.Day16_SpringMVCHIbernateDictionaryAssignment4.model.DictionaryClass;

public class DictionaryOpClass {
	public List<DictionaryClass> showListEmployee() {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		List<DictionaryClass> list = session.createCriteria(DictionaryClass.class).list();
		  for(DictionaryClass e:list)
		  System.out.println(e.getDid()+" : "+e.getWord()+" : "+e.getMeaning());
		 
		tx.commit();
		session.close();
		factory.close();
		return list;
	}
	
	public void saveDictionaryWord(DictionaryClass dictionaryClass) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		session.save(dictionaryClass);
		tx.commit();
		session.close();
		factory.close();

	}

}
