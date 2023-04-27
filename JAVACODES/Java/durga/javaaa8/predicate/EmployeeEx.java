package Java.durga.javaaa8.predicate;

import java.util.ArrayList;
import java.util.Collections;
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
 class EmployeeEx {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Imran",10000));
		l.add(new Employee("Anas",40000));
		l.add(new Employee("Wale",20000));
		l.add(new Employee("Muzammil",30000));
		//System.out.println(l);
		
		Predicate<Employee> p = e -> e.salary>20000;
		for(Employee e1 : l) {
			if(p.test(e1)) {
				System.out.println(e1.name+":"+e1.salary);
			}
		}
		
		
		
//		Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
//		System.out.println("Ascending: "+l);
//		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
//		System.out.println("Alphabetical: "+l);
		
	}

}
