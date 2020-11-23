package com.armand.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int sid;
	@Column(name = "name")
	private String sname;
	@Column(name = "surname")
	private String ssurname;
	@Column(name = "email")
	private String semail;
	
	public Student() {
		
	}
	
	public Student(String sname, String ssurname, String semail) {
		super();
		this.sname = sname;
		this.ssurname = ssurname;
		this.semail = semail;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsurname() {
		return ssurname;
	}
	public void setSsurname(String ssurname) {
		this.ssurname = ssurname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	
	
	
	
}
