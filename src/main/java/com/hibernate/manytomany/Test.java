package com.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//Setting Employee details
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		
		emp1.seteId(1001);
		emp1.setName("Clark Kent");
		
		
		emp2.seteId(1002);
		emp2.setName("Bruce Wayn");
		
		//Setting Project details
		Project prj1 = new Project();
		Project prj2 = new Project();
		
		prj1.setpId(2001);
		prj1.setName("IOT");
		
		prj2.setpId(20002);
		prj2.setName("AI");
		
		
		List<Employee> list1 = new ArrayList<Employee>();		
		list1.add(emp1);
		list1.add(emp2);
		
		List<Project> list2 = new ArrayList<Project>();
		list2.add(prj1);
		list2.add(prj2);
		
		emp1.setProject(list2);
		prj1.setEmployees(list1);
		
		
		
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(prj1);
		session.save(prj2);
		
		trans.commit();
		
		session.close();
		factory.close();

	}

}
