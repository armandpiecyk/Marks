package com.armand.project.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int tid;
	@Column(name = "name")
	private String tname;
	@Column(name = "surname")
	private String tsurname;
	@Column(name = "email")
	private String temail;
	@Column(name = "phone")
	private long tphone;
	
	public Teacher() {
		
	}
	
	public Teacher(String tname, String tsurname, String temail, long tphone) {
		super();
		this.tname = tname;
		this.tsurname = tsurname;
		this.temail = temail;
		this.tphone = tphone;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTsurname() {
		return tsurname;
	}
	public void setTsurname(String tsurname) {
		this.tsurname = tsurname;
	}
	public long getTphone() {
		return tphone;
	}
	public void setTphone(long tphone) {
		this.tphone = tphone;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	
	

}
