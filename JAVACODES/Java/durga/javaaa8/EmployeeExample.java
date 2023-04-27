package Java.durga.javaaa8;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	String name;
	int eno;
	public Employee(String name, int eno) {
		this.name=name;
		this.eno=eno;
		
	}
	public String toString() {
		return name+":"+eno;
	}
}
 class EmployeeExample {
	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee("I",1));
		l.add(new Employee("A",4));
		l.add(new Employee("W",2));
		l.add(new Employee("M",3));
		System.out.println(l);
		
//		for(Employee e: l) {
//		System.out.println("Employee Number:"+e.eno);
//		System.out.println("Employee Name:"+e.name);
//		System.out.println();
//			
//		}
		
		Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println("Ascending: "+l);
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println("Alphabetical: "+l);
		
	}

}
