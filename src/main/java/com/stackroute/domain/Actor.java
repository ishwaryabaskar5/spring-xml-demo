package com.stackroute.domain;

public class Actor {

//	declaration
	private String name;
	private String gender;
	private int age;
	
//	constructor
	public String getName() {
		return name;
	}
	
//	getter and setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
