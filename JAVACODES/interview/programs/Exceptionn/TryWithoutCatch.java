package interview.programs.Exceptionn;

import org.xml.sax.ext.Attributes2;

public class TryWithoutCatch {
	
	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
			throw new ArithmeticException();
		}
		finally {
			System.out.println("Finally Block");
		}
	}
	
	
	
}