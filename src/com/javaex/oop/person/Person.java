package com.javaex.oop.person;

public class Person {
	//필드
	protected String name;
	protected int age;
	
	public Person() {
		//	기본 생성자
		System.out.println("Person() 생성자 호출");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(String, int) 생성자 호출");
	}
	
	//	Getter/Setter
	public String gerName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}
