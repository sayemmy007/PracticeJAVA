package interview.programs.codes;

import java.net.Socket;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		//Largest no between 2 nos
//		int a;
//		int b;
//		int big;
//		System.out.println("Enter two Numbers:");
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		b = sc.nextInt();
//		
//		if(a>b) {
//			big = a;
//		}else {
//			big = b;
//		}
//		System.out.println("Largest no:"+big);	
		
		//Largest no between 3 nos
//		int x,y,z;
//		System.out.println("Enter three nos:");
//		Scanner sc = new Scanner(System.in);
//		x = sc.nextInt();
//		y = sc.nextInt();
//		z = sc.nextInt();
//		
//		if(x>y && x>z)
//			{System.out.println("Largest no:"+x);}
//		else if(y>x && y>z)
//			{System.out.println("Largest no:"+y);}
//		else {System.out.println("Largest no:"+z);
//		}
		
		
		
		
		int n;
		int total=0;
		int high;
		int counter=0;
		
		System.out.println("Enter 10 nos:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		while(counter<10) {
			total = total+n;
			counter++;
		}
		high = total;
		System.out.println("Highest no in 10 nos:"+high);
	}
}
