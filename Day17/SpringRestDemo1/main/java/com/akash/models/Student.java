package com.akash.models;

public class Student {
	private int sid;
	private String name;
	private int standard;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid,String name,int standard) {
		this.sid = sid;
		this.name = name;
		this.standard= standard;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", standard=" + standard + "]";
	}
	
	
	

}
