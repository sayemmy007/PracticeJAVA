package com.java.objectClass;

import java.util.Objects;

public class StudentDemo {

	private String name;
	private int age;
	private String address;
	
	public StudentDemo(String name, int age, String address) {
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
	 
	 @Override
		public int hashCode() {
			return this.age;
			}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != obj.getClass())
			return false;
	
		StudentDemo Student = (StudentDemo) obj;
		return (Student.age == this.age);
	}
	
	

	public static void main(String[] args) {
		 StudentDemo john = new StudentDemo("John",25,"Mumbai");
		 StudentDemo john2 = new StudentDemo("John",25,"Mumbai");
		 StudentDemo john3 = new StudentDemo("John",25,"Mumbai");
	 
		 System.out.println(john.getName());
		 System.out.println(john.getAge());
		 System.out.println(john.getAddress());
		 
		 System.out.println(john.equals(john2));
	 }
	
}
 
