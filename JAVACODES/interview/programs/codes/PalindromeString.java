package interview.programs.codes;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String s1 = "abba";//String s1 = sc.next();
		String s2 = "";
		char ch;
		
		for(int i=0; i<s1.length(); i++) {
			ch = s1.charAt(i);       //extracts each character
			s2 = ch+s2;    //abba_        //adds each character in front of the existing string
		}
		if(s1.equals(s2)) {
			System.out.println("Palindrome:"+s1);}
		else {
			System.out.println("Not Palindrome:"+s2);}
		
		
		
		
		//Method 2
//		String x = "abba";
//		String y = "abba";
//		
//		char a[] = x.toCharArray(); //toCharArray() method converts this string into character array
//		char b[] = y.toCharArray();
//	
//		if( Arrays.equals(a, b)) {
//			System.out.println("Palindrome");}
//		else {System.out.println("Not Palindrome");}
//	}
	}
}
