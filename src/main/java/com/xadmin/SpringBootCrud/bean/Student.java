package com.xadmin.SpringBootCrud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table") 
public class Student {
	@Id
	private String id;
	private String firstname;
	private String lastname;
	private String DOB;
	private String Address;
	
	public Student() {
		super();
	}
	public Student(String id, String firstname, String lastname, String dOB, String address) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		DOB = dOB;
		Address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}


}
