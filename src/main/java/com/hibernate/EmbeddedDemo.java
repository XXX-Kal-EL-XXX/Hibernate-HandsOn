package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedDemo {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		ContactPerson contactPerson = new ContactPerson();
		contactPerson.setFirstName("Clark");
		contactPerson.setLastName("Kent");
		contactPerson.setPhone("6888688812");
		
		Company company = new Company();
		company.setAddress("Metropolis");
		company.setName("Daily Planet");
		company.setContactPerson(contactPerson);
		
		ContactPerson contactPerson1 = new ContactPerson();
		contactPerson1.setFirstName("Bruce");
		contactPerson1.setLastName("Wayn");
		contactPerson1.setPhone("6888688811");
		
		Company company1 = new Company();
		company1.setAddress("Gautham City");
		company1.setName("Wayn Industry");
		company1.setContactPerson(contactPerson1);
		
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(company);
		session.save(company1);
		trans.commit();
		session.close();
		factory.close();
	}

}
