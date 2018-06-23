package com.learn.java.extend;

public class Person {
	String name;
	public Person() {
	}
	public Person(String name) {
		this.name= name;
	}
	
	public void eat() {
		System.out.println("Person will eat something");
	}
	public void getName() {
		System.out.println(name);
	}
}
