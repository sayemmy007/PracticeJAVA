package Java.durga.javaaa8.consumerrr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

class Employee{
	String name;
	double salary;
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
		
	}
	public String toString() {
		return name+":"+salary;
	}
}
 class BiConsumerex {

	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		
		BiConsumer<Employee,Double> c=(e,d)->e.salary=e.salary+d;
		
		for(Employee e:l) {
			c.accept(e, (double) 500);
		}
		for(Employee e:l) {
			String name = "";
			System.out.println("Employee Name:"+e.name);
			System.out.println("Employee Salary:"+e.salary);
			System.out.println();
		}
	}
	
	private static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Imran",10000));
		l.add(new Employee("Anas",40000));
		l.add(new Employee("Wale",20000));
		l.add(new Employee("Muzammil",30000));
	}
	
	
 }		