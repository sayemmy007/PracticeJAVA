package Java.durga.javaaa8.Streammms;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//public class SortedMethod{                          // Integer
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> l = new ArrayList<>();
//		l.add(70);
//		l.add(45);
//		l.add(10);
//		l.add(65);
//		l.add(20);
//		l.add(25);
//		System.out.println(l); // Insertion order
//		
//		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList()); //Asscending 
//		System.out.println(l1);
//		
//		List<Integer> l3 = l.stream().sorted((s1,s2)->(s1<s2)?1:(s1>s2)?-1:0).collect(Collectors.toList()); //Descending 
//		System.out.println(l3);
//		
//		List<Integer> l4 = l.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList()); // descending
//		System.out.println(l4);
//	}
//}



//public class SortedMethod{
//	public static void main(String[] args) {      // String
//		
//		ArrayList<String> l = new ArrayList<>();
//		l.add("Imrancscncdmldcsklcsclskcckldsdlc");
//		l.add("Muzamil");
//		l.add("Zaid");
//		l.add("anas");
//		l.add("UmarAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//		l.add("Wali");
//		System.out.println(l);  // insertion order
//		
//		List<String> l2 = l.stream().sorted().collect(Collectors.toList()); // Asscending 
//		System.out.println(l2);
//		
//		List<String> l3 = l.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList()); // Descending
//		System.out.println(l3);
//	}
//}



public class SortedMethod{
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		l.add("A");
		l.add("AAAA");
		l.add("AA");
		l.add("AAAAAA");
		l.add("XXX");
		l.add("AAA");
		System.out.println(l);  // insertion order
		Comparator<String> c = (s1,s2) -> {                                             
			                               int l1 = s1.length();
			                               int l2 = s2.length();
			                               if(l1<l2) return -1;
			                               else if(l1>l2) return 1;
			                               else return s1.compareTo(s2);
		                                 };
		 List<String> sortedList = l.stream().sorted(c).collect(Collectors.toList());      // Alphabetical order
		 System.out.println(sortedList);
		 
		 List<String> sortedList1 = l.stream().sorted((s1,s2)-> s1.compareTo(s2)).collect(Collectors.toList());  // or Alphabetical
		 System.out.println(sortedList1);
		 
		 List<String> sortedList2 = l.stream().sorted((s1,s2)-> s2.compareTo(s1)).collect(Collectors.toList());  // or Reverse Alphabetical
		 System.out.println(sortedList2);
		 
		}
	}
