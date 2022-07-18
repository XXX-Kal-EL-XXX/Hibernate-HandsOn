package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//Creating Student details
		Student s1 = new Student();
		s1.setId(1001);
		s1.setName("Kal-El");
		s1.setAddress("Metroplois");
		
		Student s2 = new Student();
		s2.setId(1002);
		s2.setName("ABC");
		s2.setAddress("DEF");
		
		
		//Creating Subjects
		Subject sub1 = new Subject();
		sub1.setId(2001);
		sub1.setName("Python");
		sub1.setStudent(s1);
		sub1.setStudent(s2);
		
		Subject sub2 = new Subject();
		sub2.setId(2002);
		sub2.setName("Java");
		sub2.setStudent(s1);
		sub2.setStudent(s2);
		
		Subject sub3 = new Subject();
		sub3.setId(2003);
		sub3.setName("Hibernate");
		sub3.setStudent(s1);
		sub3.setStudent(s2);
		
		
		
		
		
		List<Subject> subject = new ArrayList<Subject>();
		subject.add(sub1);
		subject.add(sub2);
		subject.add(sub3);
		
		
		s1.setSubject(subject);
		s2.setSubject(subject);
		
		
		//Saving Data into Database
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
//		
		session.save(s1);
		session.save(s2);
		session.save(sub1);
		session.save(sub2);
		session.save(sub3);
		trans.commit();
//		
//    	Student st = session.get(Student.class, 1001);
//		System.out.println(st.getName());
//		System.out.println(st.getSubject().size());
//		
////		for(Subject sub : st.getSubject())
////		{
////			System.out.println(sub.getName());
////		}
		
		
		
		session.close();
		factory.close();

	}

}
