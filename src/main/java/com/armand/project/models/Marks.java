package com.armand.project.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Marks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int mid;
	@ManyToOne
	private Student student;
	private double weight;
	private double grade;
	@ManyToOne
	private Subject subject;
	
	public Marks() {
		
	}
	
	public Marks(Student student, double weight, double grade, Subject subject) {
		super();
		this.student = student;
		this.weight = weight;
		this.grade = grade;
		this.subject = subject;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	
}
