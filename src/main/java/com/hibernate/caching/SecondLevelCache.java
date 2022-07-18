package com.hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student1;

public class SecondLevelCache {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//First Level Caching.
		Session session = factory.openSession();
		Student1 student = session.get(Student1.class, 1004);
		System.out.println(student);
		session.close();
		
		
		//Second Level Caching.(It does not fire select query as the Object is already present in the Second level Cache.) 
		Session session1 = factory.openSession();
		Student1 student1 = session1.get(Student1.class, 1004);
		System.out.println(student1);
		session1.close();
		
		
		factory.close();
	
	}

}
