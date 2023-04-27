package interview.programs.Exceptionn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class TooYoungException extends RuntimeException{
	
	public TooYoungException(String msg) {
		super(msg);
}
}

class TooOldException extends RuntimeException{   
	
	public TooOldException(String msg2) {
	     super(msg2);
 }
}
public class UnchekcedCustomException {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter Age: ");  
		int age= sc.nextInt();  
		
		if(age<18) {
			
			 throw new TooYoungException("Please wait some more time");
		}
		else if(age>60){
			
			throw new TooOldException("Too old get married");
		}
		else {
			System.out.println("Thanks for registration");
		}
		


	}
}

