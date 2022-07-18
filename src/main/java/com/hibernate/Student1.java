package com.hibernate;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
//Second Level Caching Reading from Student1 Table
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student1 {
	@Id
	private int id;
	
	private String name;
	
	private String city;
	
	public Student1(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Student1() {
		super();
		
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
	
		return this.id+(" : ")+this.name+(" : ")+this.city;
	}
	
	
	
	

}
