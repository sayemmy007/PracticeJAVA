package Java.durga.javaaa8;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FIWithLambda5Comparator {

	public static void main(String[] args) {
		 
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(2);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(30);
		l.add(0);
		l.add(15);
		System.out.println(l);
		
		Comparator<Integer> c =(I1,I2) -> (I1<I2)?-1 : (I1>I2)?+1 : 0;
		Collections.sort(l,c);
		System.out.println(l);
		
		
		l.stream().forEach(System.out::println); /// 
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
	}

}
