package Java.durga.javaaa8.function;

import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	Student(String name, int marks){
		this.name=name;
		this.marks=marks;
	}
}

public class EmployeeFunction {

	public static void main(String[] args) {
		
		Function<Student,String> f =  i ->{
			                             int marks = i.marks;
			                             String grade ="";
			                             if(marks>80) grade = "A[Distinction]";
			                        else if(marks>60) grade = "B[First Class]";
			                        else if(marks>50) grade = "C[Second Class]";
			                        else if(marks>35) grade = "D[Third Class]";
			                        else grade = "E[Failed]";
			                             return grade;
		                          };
		                          
		                        
		                          
		                          Student[] s = {
		                        		        new Student("Imran",100),
		                        		        new Student("Imran2",65),
		                        		        new Student("Imran3",55),
		                        		        new Student("Imran4",45),
		                        		        new Student("Imran5",25)
		                        		        
		                          };
		                          
		                          for(Student s1 : s) {
		                        	  
		                        	  System.out.println("Student Name:"+s1.name);
		                        	  System.out.println("Student Marks:"+s1.marks);
		                        	  System.out.println("Student grade:"+f.apply(s1));
		                        	  System.out.println();
		                          }	                          
	}
}
