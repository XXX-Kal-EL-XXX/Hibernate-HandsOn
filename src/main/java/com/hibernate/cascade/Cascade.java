package com.hibernate.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.onetomany.Student;
import com.hibernate.onetomany.Subject;

public class Cascade {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student student = new Student();
		
		student.setId(1003);
		student.setAddress("Central City");
		student.setName("Flash");
		
		Subject s1 = new Subject(2004, "R language");
		Subject s2 = new Subject(2005, "Flask");
		Subject s3 = new Subject(2006, "Django");
		
		List<Subject> list = new ArrayList<Subject>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		student.setSubject(list);
		
		
		Transaction trans = session.beginTransaction();
		
		session.save(student);
		
		
		trans.commit();
		
		
		session.close();
		factory.close();
	}

}
