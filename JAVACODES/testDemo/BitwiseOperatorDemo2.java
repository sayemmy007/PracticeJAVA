package testDemo;

public class BitwiseOperatorDemo2 {

	public static void main(String[] args) {
			
		int a = 10;
		int b = 40;
		
		int operation = a << 2;
		System.out.println("Before left shift=" +a);
		System.out.println("After left shift=" +operation);
		
		int operation1 = b >> 2;
		System.out.println("Before right shift=" +b);
		System.out.println("After right shift=" +operation1);

	}

}
