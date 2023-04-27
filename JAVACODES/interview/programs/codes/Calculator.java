package interview.programs.codes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no:");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd no:");
		int n2 = sc.nextInt();
		
		System.out.println("Select Symbol(+,-,*,/)");
		String sym = sc.next();
		int result;
		
		switch(sym) {
		
		case"+":result = n1+n2;
		        System.out.println("Addition is:"+result);
		        break;
		        
		case"-":result = n1-n2;
        System.out.println("Subtraction is:"+result);
        break;
        
		case"*":result = n1*n2;
        System.out.println("Multiply is:"+result);
        break;
        
		case"/":result = n1/n2;
        System.out.println("Divide is:"+result);
        break;
		
		default:System.out.println("Invalid Symbol");
		break;
		}
	}

}
