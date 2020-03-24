package com.db.model;

public class Student {
	private int id;
	private String userName;
	
	public Student() {
		
	}

	public Student(String userName) {
		super();
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", userName=" + userName + "]";
	}
	
	
	
}
