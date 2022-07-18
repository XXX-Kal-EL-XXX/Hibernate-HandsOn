package com.hibernate.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.onetomany.Subject;

public class HqlExample {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		String query = "from Subject where name =:x and id =:i";	
		
//Query Using Alias		
//String query1 = "from Subject s where s.name =:x and s.id=:i";
		
		Query q = session.createQuery(query);
		
		q.setParameter("x", "Hibernate");
		q.setParameter("i", 2003);
		
		List<Subject> list = q.list();
		
		for(Subject s : list) {
			System.out.println(s.getStudent().getName()+" : "+s.getName());
		}
		
		System.out.println("__________________________________________________");
		
		Transaction trans = session.beginTransaction();
		
//Deleting Element form Database
//		Query query2 = session.createQuery("delete from Subject s where s.student=:student");
//		query2.setParameter("student", "Kal-El");
//		
//		
//		int r = query2.executeUpdate();
//		System.out.println("Deleted");
//		System.out.println(r);
	
//		
		
//Updating elements in Database
//		Query query3 = session.createQuery("update from Student set name=:x where id=:i");
//		query3.setParameter("x", "Dayana");
//		query3.setParameter("a", "Amazon");
//		query3.setParameter("i", 1002);
//		
//		int r = query3.executeUpdate();
//		
//		System.out.println("Updated "+r+" rows successfully");
		
		trans.commit();
		
//Join Query 
		   Query query3 = session.createQuery("select s.name, s.id, a.name from Student as s INNER JOIN s.subject as a ");
		   
		   List<Object []> list3 = query3.getResultList();
		   
		   for(Object[] s : list3) {
			   System.out.println(Arrays.toString(s));
		   }
		    
		    
		
	
		
		
		session.close();
		factory.close();
		
	}

}
