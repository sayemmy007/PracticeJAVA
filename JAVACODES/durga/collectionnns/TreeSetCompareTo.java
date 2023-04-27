package durga.collectionnns;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCompareTo {
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		System.out.println("A".compareTo("B"));  // 65-66 = -1
		System.out.println("A".compareTo("a")); //  65-97 = -32
		System.out.println("a".compareTo("A"));
	    System.out.println("A".compareTo(null));
	    
	}
}



	