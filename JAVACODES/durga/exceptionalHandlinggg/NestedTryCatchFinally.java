package durga.exceptionalHandlinggg;

public class NestedTryCatchFinally {

	public static void main(String[] args) {
		
		try {
	       System.out.println("outer try");
	        try {
	        	System.out.println("Inner Try");
	        	System.out.println(10/0);
	        }
	        catch(ArithmeticException e) {
	        	System.out.println("inner catch");
	        }
	        System.out.println("after inner try catch");
		}
		catch(Exception e) {
			System.out.println("outer catch");
		}
		finally {
			System.out.println("finally");
		}
	}
}
