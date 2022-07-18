package com.hibernate.nativesql;

import org.hibernate.query.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NativeSql {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		String q = ("select * from student1");
		
		NativeQuery query = session.createSQLQuery(q);
		
		List<Object[]> list = query.list();
		
		for(Object[] st : list) {
			//Getting Particular Columns
			System.out.println(st[0]+" : "+st[2]);
			//Printing All Columns
			//System.out.println(Arrays.toString(st));
		}
		
		session.close();
		factory.close();
	}

}
