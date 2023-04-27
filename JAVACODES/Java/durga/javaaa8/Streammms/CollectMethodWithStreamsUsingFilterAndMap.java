package Java.durga.javaaa8.Streammms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//public class CollectMethodWithStreamsUsingFilterAndMap {   // without Streams
//
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> l = new ArrayList<>();
//		for(int i=0; i<10; i++) {
//			l.add(i);
//			}
//			System.out.println(l);
//			
//			ArrayList<Integer> l2 = new ArrayList<>();
//			for(Integer i:l) 
//				if(i%2==0) {
//					l2.add(i);
//				}
//				System.out.println(l2);
//	  }
//}

//public class CollectMethodWithStreamsUsingFilterAndMap{    /// Collect()method with Stream using Filter
//	public static void main(String[] args) {
//		ArrayList<Integer> l = new ArrayList<>();
//		for(int i=0; i<10; i++) {
//			l.add(i);
//		}
//		System.out.println(l);
//		
//		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(l2);
//	}
//}

public class CollectMethodWithStreamsUsingFilterAndMap{    /// Collect()method with Stream using Map
public static void main(String[] args) {
	ArrayList<String> l = new ArrayList<>();
    l.add("abc");
    l.add("xyz");
	System.out.println(l);
	
	List<String> l2 = l.stream().map(s->s.toUpperCase() ).collect(Collectors.toList());
	System.out.println(l2);
}
}

