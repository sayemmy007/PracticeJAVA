package Java.durga.javaaa8.Streammms;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class PeriodObject {

	public static void main(String[] args) {
		
		//Period object can be used to represent quantity of time
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1998,01,02);
		Period p = Period.between(birthday,today);
		System.out.printf("age is %d year %d months %d days",p.getYears(),p.getMonths(),p.getDays());

		 
		// write a program to check the given year is leap year or not
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    Year y = Year.of(n); 
	      if(y.isLeap()) {
		      System.out.printf("%d is Leap year",n); 
		      }
		 else {
		 System.out.printf("%d is not Leap year",n); 
		 }


	}

}
