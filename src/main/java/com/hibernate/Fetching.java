package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetching {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		//getting information using load() method
		Student1 student = session.load(Student1.class, 1004);
		System.out.println(student);
		
		
		//getting information using get() method
		 Address address = session.get(Address.class, 1);
		 System.out.println(address.getCity());
		
		
		session.close();
		factory.close();
	}

}
