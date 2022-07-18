package com.hibernate.xml.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		Person person = new Person();
		person.setId(1000);
		person.setName("Dead-Shot");
		person.setAddress("Gotham");
		person.setPhone("+18-56664111");
		
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		session.save(person);
		
		trans.commit();
		
		session.close();
		factory.close();

	}

}
