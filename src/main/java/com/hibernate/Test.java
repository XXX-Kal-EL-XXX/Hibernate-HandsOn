package com.hibernate;

//import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class Test {

	public static void main(String[] args) throws IOException {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
//    								OR
		
//		Configuration config = new Configuration("hibernate.cfg.xml");
//		config.configure();
//		SessionFactory factory1 = config.buildSessionFactory();
		
		System.out.println(factory);
		System.out.println(factory.isOpen());
		
		
//		Setting Student Information.
		
		Student1 student = new Student1();
		student.setId(1002);
		student.setName("Dayana");
		student.setCity("Amazon");
		System.out.println(student);
	
		
		Teacher teacher = new Teacher();
		teacher.setId(1000);
		teacher.setName("Batman");
		teacher.setCity("Gautham City");
		System.out.println(teacher);
		
		
//		Address address = new Address();
//		address.setCity("Metropolis");
//		address.setAddedDate(new Date());
//		address.setOpen(true);
//		address.setStreet("Arkham");
//		address.setX(1245.21);
		
		//Setting the image into image object 
		
//	    FileInputStream fis = new FileInputStream("src/main/java/images.jpeg");
//	    byte[] data = new byte[fis.available()];
//	    fis.read(data);
//	    address.setImage(data);
//	    fis.close();
			
		
//		//Saving Students and Teacher Information into database
		
		Session session = factory.openSession();
		
		Transaction trans = session.beginTransaction();
		
		session.save(student);
		
		session.save(teacher);
		
//		session.save(address);
		
		trans.commit();
		
		session.close();
		
			
		
	}

}
