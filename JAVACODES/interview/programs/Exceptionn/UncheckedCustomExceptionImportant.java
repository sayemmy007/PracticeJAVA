package interview.programs.Exceptionn;
import java.util.Scanner;

class BelowAgeException extends RuntimeException{
	
	public String toString() {
		return "You cannot vote";
	}
}

public class UncheckedCustomExceptionImportant {

	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter Age to vote: ");  
		int age= sc.nextInt();  
		
		//using try catch
		if(age<18) {
			try {
				throw new BelowAgeException();
		}
		catch(BelowAgeException ae) {
			System.out.println(ae);
			}	
		}
		else
			{ System.out.println("Eligible");}
	   
		System.out.println("End of main");
		
		
		// without using try cacth
//		if(age<18) {
//			 throw new BelowAgeException();
//		}
//		else{
//			System.out.println("Eligible");
//		}
//		System.out.println("End of main");
	}
}


