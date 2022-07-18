package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Questions questions = new Questions();
		questions.setQuestionId(1001);
		questions.setQuestion("Real name of SuperMan");
		
		Answers answers = new Answers();
		answers.setAnswerId(2001);
		answers.setAnswer("Kal-El");
		answers.setQuestions(questions);
		
		questions.setAnswer(answers);
		
		Questions questions1 = new Questions();
		questions1.setQuestionId(1002);
		questions1.setQuestion("Real name of Batman");
		
		Answers answers1 = new Answers();
		answers1.setAnswerId(2002);
		answers1.setAnswer("Bruce Wayn");
		answers1.setQuestions(questions1);
		
		questions1.setAnswer(answers1);
		
		
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
//		session.save(questions);
//		session.save(answers);
//		session.save(questions1);
//		session.save(answers1);
		trans.commit();
		
		//Getting from database
		 Questions q1 = session.get(Questions.class, 1002);
		 System.out.println(q1.getQuestion());
		 System.out.println(q1.getAnswer().getAnswer());
		
		
		session.close();
		factory.close();
	}

}
