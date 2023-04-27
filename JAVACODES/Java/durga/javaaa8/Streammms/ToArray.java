package Java.durga.javaaa8.Streammms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ToArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println(l);
		
		Integer[] i = l.stream().toArray(Integer[]::new);    
		System.out.println(i);
		
		
		String s = Arrays.toString(i);
		System.out.println(s);
		
		
		Stream.of(i).forEach(System.out::println);
		Stream.of(i).forEach((s1)->System.out.println(s1));
		
		//or
//		for(Integer i1 : i) { // encahnced loop
//			System.out.println(i1);
//		}
		
	}
	
}
