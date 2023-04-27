package Java.durga.javaaa8.Streammms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//public class CollectMehod2 {       // collect() using filter
//
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> l = new ArrayList<>();
//		l.add(0);
//		l.add(5);
//		l.add(10);
//		l.add(15);
//		l.add(20);
//		l.add(25);
//		System.out.println(l);
//		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(l2);
//		
//	}
//}

public class CollectMehod2 {   // collect() using Map

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List<Integer> updatedMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		
	}
}
