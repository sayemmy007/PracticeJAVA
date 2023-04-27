package com.java.objectClass;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import com.java.classes.Student;

public class StudentComparable implements Comparable<StudentComparable>{

	private int rollNumber;
	private String name;
	private int age;
	
	public StudentComparable(int rollNumber,String name, int age) {
		this.name=name;
		this.age=age;
		this.rollNumber=rollNumber;	
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setrollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	
	
	 public String toString() {
		return("Student name: " +this.getName() + "age: " +this.getAge() + "address: " +this.getRollNumber());
	}
	 

	

	public static void main(String[] args) {
		
	 ArrayList<StudentComparable> list = new ArrayList<StudentComparable>();
	 StudentComparable john = new StudentComparable(3, "John", 21);
	 StudentComparable tom = new StudentComparable(1, "tom", 30);
	 StudentComparable stan = new StudentComparable(2, "stan", 41);
	 
	 list.add(john);
	 list.add(tom);
	 list.add(stan);
	 
	 Collections.sort(list);
	 System.out.println("after sorting:");
	 list.forEach(studentComparable -> System.out.println(studentComparable.getRollNumber()));
	 
	 }

	@Override
	public int compareTo(StudentComparable studentComparable) {
	
		return this.age - studentComparable.age;
	}
}
 
