package com.dto;

public class Person {
	String username;
	int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + "]";
	}
	
	

}
