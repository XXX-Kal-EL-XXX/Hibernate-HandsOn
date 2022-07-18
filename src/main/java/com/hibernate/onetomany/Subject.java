package com.hibernate.onetomany;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	@Id
	@Column(name = "Book_Id")
	private int id;
	
	@Column(name = "Book_Name")
	private String name;
	
	@ManyToOne
	private Student student;

	
	public Subject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
//		this.student = student;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Subject() {
		super();
	}
	
	
	

}
