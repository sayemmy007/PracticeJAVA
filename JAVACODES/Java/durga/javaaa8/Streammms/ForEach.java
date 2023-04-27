package Java.durga.javaaa8.Streammms;

import java.util.ArrayList;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

//public class ForEach {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> l = new ArrayList<>();
//		l.add(10);
//		l.add(0);
//		l.add(15);
//		l.add(5);
//		l.add(20);
//		System.out.println(l);
//		
//	//	l.stream().forEach(System.out::println);       // or Method ref
//		
//		
//		List<Integer> l2 = l.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
//		System.out.println(l2);
//	    
//		l2.stream().forEach((s)->System.out.println(s)); // or forEach(lambdexpa)
//	}
//}

public class ForEach {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println(l);
		
		Consumer<Integer> c =i->{
			System.out.println("Square of " +i+ " is : " +(i*i));	  // to print our own function 
		};
		
		l.stream().forEach(c);
	}
}





 