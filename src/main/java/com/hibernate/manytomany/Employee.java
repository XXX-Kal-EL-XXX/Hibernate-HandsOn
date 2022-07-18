package com.hibernate.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	@Column(name = "Employee_Id")
	private int eId;
	
	@Column(name = "Employee_Name")
	private String name;
	
	@ManyToMany
	@JoinTable(
			name = "Deployment", 
			joinColumns = {@JoinColumn(name="Employee_ID")}, 
			inverseJoinColumns = {@JoinColumn(name="Project_ID")}
			)
	private List<Project> projects;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return projects;
	}

	public void setProject(List<Project> projects) {
		this.projects = projects;
	}

	public Employee(int eId, String name, List<Project> projects) {
		super();
		this.eId = eId;
		this.name = name;
		this.projects = projects;
	}

	public Employee() {
		super();
	}
	
	

}
