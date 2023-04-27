package interview.programs.codes;

class Employee{
	
	float salary = 10000;                      // properties == data members == varialbbless = state
	                                          // code = methods = behavior
}
class Hr extends Employee{
	
	float salary = 20000;
	
	void display() {
		System.out.println("Salary:" +this.salary);
	}
}



public class SuperKeyword {

	public static void main(String[] args) {
		
		Hr hr = new Hr();
		hr.display();
	}

}
