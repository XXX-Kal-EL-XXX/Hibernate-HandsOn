package com.hibernate.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Questions {
	@Id
	@Column(name = "Question_ID")
	private int questionId;
	
	@Column(name = "Question")
	private String question;
	
	@OneToOne
	@JoinColumn(name = "Ans_Id")
	private Answers answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answers getAnswer() {
		return answer;
	}

	public void setAnswer(Answers answer) {
		this.answer = answer;
	}

	public Questions(int questionId, String question, Answers answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public Questions() {
		super();
		}
	
	

}
