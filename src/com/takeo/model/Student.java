package com.takeo.model;

public class Student {
	
	int sno;
	String sname;
	String sadd;
	
	//Getter and setter
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	// Constructor
	public Student(int sno, String sname, String sadd) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
