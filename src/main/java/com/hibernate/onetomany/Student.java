package com.hibernate.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@Column(name = "Student_Id")
	private int id;
	
	@Column(name="Full_Name")
	private String name;
	
	@Column(name = "Address")
	private String address;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Subject> subject;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public Student(int id, String name, String address, List<Subject> subject) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.subject = subject;
	}

	public Student() {
		super();
	}
	
	
	
}
