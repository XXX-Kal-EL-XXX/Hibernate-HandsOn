package com.hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student1;

public class FirstLevelCache {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		//By Default First Level Caching is provided by Hibernate.
		
		Student1 student = session.get(Student1.class,1004);
		System.out.println(student);
		
// Calling same object with id 1004 but this time Hibernate will check if same obj is present in session's cache memory
		System.out.println("Calling Same Object id i.e 1004");
		
		Student1 student1 = session.get(Student1.class, 1004);
		System.out.println(student1);
		
		session.close();
		factory.close();
	}

}
