package com.armand.project.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int subid;
	@Column(name = "subject")
	private String subject;
	@ManyToOne
	private Class subclass;
	@ManyToOne	
	private Teacher teacher;
	
	public Subject(){
		
	}
	
	public Subject(String subject, Class subclass, Teacher teacher) {
		super();
		this.subject = subject;
		this.subclass = subclass;
		this.teacher = teacher;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Class getSubclass() {
		return subclass;
	}
	public void setSubclass(Class subclass) {
		this.subclass = subclass;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	

}
