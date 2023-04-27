package interview.programs.codes;

public class FactorialByRecursion {

	static int fact=1;
	public static void main(String[] args) {
		
		int n=5;
		FactorialByRecursion f = new FactorialByRecursion();
		f.calFact(n);
		System.out.println("Factorial of "+n+" is "+fact);
	}
	void calFact(int n) {
		if(n>=1) {
			fact = fact*n;
			calFact(n-1); 
		}
	}

}
