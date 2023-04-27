package interview.programs.Exceptionn;

import java.util.Scanner;

class AgeException extends Exception{
	public String toString() {
		return "You cannot vote";
	}
}

public class CheckedCustomExceptionImportant {

	public static void main(String[] args) throws AgeException {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter Age to vote: ");  
		int age= sc.nextInt(); 
		
		//using try catch
		if(age<18) {
			try {
				throw new AgeException();
			}
			catch(AgeException ae) {
				System.out.println(ae);
			}
		}
		else 
			{ System.out.println("Eligible"); }
		
		System.out.println("End of main");
		
		
		
		
		// without using try cacth
//		if(age<18) {
//		 throw new BelowAgeException();
//	     }
//	   else{
//		System.out.println("Eligible");
//	   }
//	  
//		System.out.println("End of main");
	
	}
}


