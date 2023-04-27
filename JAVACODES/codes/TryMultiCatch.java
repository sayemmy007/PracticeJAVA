
public class TryMultiCatch {

	public static void main(String[] args) {
		
		try {
		//	int sum = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ARException");
		}catch(Exception e) {
			System.out.println("Exception");
		}

	}

}
