package com.java.classes;

public class Student {

	String name;
	int age;
	String address;
	
	public Student(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;	
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
	
	 public String toString() {
		return("Student name: " +this.getName() + "age: " +this.getAge() + "address: " +this.getAddress());
	}
	 
	 public static void main(String[] args) {
		 Student john = new Student("John",25,"Mumbai");
		 System.out.println(john.getName());
		 System.out.println(john.getAge());
		 System.out.println(john.getAddress());
	 }
	
}
 
