package interview.programs.codes;

import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		int rem;
		
		while(temp!=0) {
			rem = temp % 10;
			temp = temp/10;
			rev = (rev * 10) + rem;
	    }
		if(n==rev) {
			System.out.println("Palindrome");}
		else{
			System.out.println("Not Palindome");}

  }
	}
