//usage of streams using filter
//cricketers name and age database
package com.practice;

public class Cricketers {
	//instance variables of cricketers class
	private String name;
	private int age;
	
	//generating getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Cricketers(String name, int age){
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Name : " + name + " Age : " + age;
	}
	
	
	
	

}
