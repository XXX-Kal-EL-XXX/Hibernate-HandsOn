package com.hibernate.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answers {
	@Id
	@Column(name = "Answer_Id")
	private int answerId;
	
	@Column(name = "Answer")
	private String answer;
	
	@OneToOne(mappedBy = "answer")
	private Questions questions;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Questions getQuestions() {
		return questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}

	public Answers(int answerId, String answer, Questions questions) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.questions = questions;
	}

	public Answers() {
		super();
	}

	
	
	

}
