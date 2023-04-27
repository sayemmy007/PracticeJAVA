package LosselyTightlyCoupled;

class Employee{
	int eid;
	String ename;
	Address address;
	
	Employee(){
		eid = 0;
		ename = "Imran";
		address = new Address();
		 System.out.println(address);
	}
}

class Address{
	String city,state;
	int zicode;
}


public class TightlyCoupled {

	public static void main(String[] args) {
		 Employee e = new Employee();
		 System.out.println(e);
		

	}

}
