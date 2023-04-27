package durga.collectionnns;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {
	String name;
	int eid;
	Employee(String name, int eid){
		this.name = name;
		this.eid = eid;
	}
	public String toString() {
		return name+"-"+eid;
	}
	public int compareTo(Object obj) {
		int eid1 = this.eid;
		Employee e = (Employee)obj;
		int eid2 = e.eid;
		if(eid1 < eid2) {
			return -1;
		}else if(eid1 > eid2) {
			return 1;
		}else {
			return 0;
		}
	}
}

class ComCompDemo{
	public static void main(String[] args) {
		Employee e1 = new Employee("imran", 10);
		Employee e2 = new Employee("anas", 70);
		Employee e3 = new Employee("wali", 1);
	    
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);
		 
		TreeSet t1 = new TreeSet(new MyComparator3());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		System.out.println(t1);
		}
}

class MyComparator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	    Employee e1 = (Employee)o1;
	    Employee e2 = (Employee)o2;
	    String s1 = e1.name;
	    String s2 = e2.name;
		return s1.compareTo(s2);
	}
}

