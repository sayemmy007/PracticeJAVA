package LosselyTightlyCoupled;

class Employee1{
	int eid;
	String ename;
	Address1 address;
	
	Employee1(){
		eid = 0;
		ename = "Imran";
	}
	Employee1(Address1 adrs){
		address = adrs;
	}
	void setAdress(Address1 adrs) {
		address = adrs;
	}
}

class Address1{
	String city,state;
	int zipcode;
}

public class LosselyCoupled {
public static void main(String[] args) {
	
  
	    Employee1 e1 = new Employee1();
	    System.out.println(e1);
	     
	    Address a = new Address();
	    System.out.println(a);
	    
	    e1.setAdress(null);
	  
	  
	   
	   
	
}
}
