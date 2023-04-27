package Java.durga.javaaa8.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiFunction;

class Employee{
	String name;
	int eno;
	public Employee(int eno,String name) {
		this.name=name;
		this.eno=eno;	
	}
}

 class BiFunctionEmployee {
	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		BiFunction<Integer, String, Employee> f = (eno,name) -> new Employee(eno, name);
		
		l.add(f.apply(100, "Imran"));
		l.add(f.apply(200, "Imran 1"));
		l.add(f.apply(300, "Imran 3"));
		l.add(f.apply(400, "Imran 4"));
		
		for(Employee e : l) {
			System.out.println("Employee Number:"+e.eno);
			System.out.println("Employee Name:"+e.name);
			System.out.println();
		}
		
		
	}

}
