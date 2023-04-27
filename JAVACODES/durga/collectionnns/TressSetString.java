package durga.collectionnns;

import java.util.Comparator;
import java.util.TreeSet;

public class TressSetString {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet(new MyComparator1());
		t.add("Imran");
		t.add("Anas");
		t.add("Wali");
		t.add("ziad");
		t.add("z");
		t.add("zzz");
		t.add("zxx");
		t.add("Abid");
	   System.out.println(t);
	}
}

class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
	//	String s2 = (String)o2;
		return s2.compareTo(s1);  // reverse Alphabetical order
		
//		return -s2.compareTo(s1);  //  Alphabetical order
		
	}
	
}



	
	

