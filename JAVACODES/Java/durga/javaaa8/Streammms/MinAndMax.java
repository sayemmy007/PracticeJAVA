package Java.durga.javaaa8.Streammms;

import java.util.ArrayList;

//public class MinAndMax {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> l = new ArrayList<>();
//		l.add(10);
//		l.add(20);
//		l.add(15);
//		l.add(5);
//		l.add(20);
//		System.out.println(l);
//		
//		Integer min = l.stream().min((i1,i2) -> i1.compareTo(i2)).get();
//		System.out.println("Mininum value:"+min);
//		
//		Integer max = l.stream().max((i1,i2) -> i1.compareTo(i2)).get();
//		System.out.println("Maximumn value:"+max);
//		
//		Integer max1 = l.stream().max((i1,i2) -> -i1.compareTo(i2)).get();
//		System.out.println("Maximumn value:"+max1);
//	}
//
//}


public class MinAndMax {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		l.add("A");
		l.add("AAAA");
		l.add("AA");
		l.add("AAAAAA");
		l.add("XXX");
		l.add("AAA");
		System.out.println(l);  // insertion order
		
		String min = l.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("Mininum value: "+min);
		
		String max = l.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximumn value: "+max);
		
		String max1 = l.stream().max((i1,i2) -> -i1.compareTo(i2)).get();
		System.out.println("Maximumn value: "+max1);
	}

}


