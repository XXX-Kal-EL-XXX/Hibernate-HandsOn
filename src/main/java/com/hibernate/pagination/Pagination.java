package com.hibernate.pagination;

import org.hibernate.query.*;

import com.hibernate.Student1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Pagination {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		 
		Query query = session.createQuery("from Student1");
		
		query.setFirstResult(5);
		query.setMaxResults(20);
		
		List<Student1> list = query.list();
		
		for(Student1 st : list) {
			System.out.println(st.getId()+" : "+st.getName()+" : "+st.getCity());
		}
		
		session.close();
		factory.close();
		
		
	}

}
