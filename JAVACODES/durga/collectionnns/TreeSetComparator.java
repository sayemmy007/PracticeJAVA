package durga.collectionnns;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {
	public static void main(String[] args) {		
        TreeSet<Integer> t = new TreeSet(new MyComparator());
		
	
		t.add(20);
		t.add(10);
		t.add(8);
		t.add(3);
		t.add(40);
		System.out.println(t);
	}
}
 
class MyComparator implements Comparator
{
//	@Override
//	public int compare(Object o1, Object o2) {
//		Integer I1 = (Integer)o1;  // we cannot use toString() bcoz its Integer value 
//		Integer I2 = (Integer)o2;
//		if(I1 < I2)
//			 return +1;
//		else if(I1 > I2)
//			 return -1;
//		else
//		return 0;
//	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
//		return I1.compareTo(I2);  // Ascending order
		return I2.compareTo(I1);  // Decending order
//      return -I2.compareTo(I1); // Asecending order
//	    return -I1.compareTo(I2); // Decending order
//		return +1;                // Ascending order
//		return -1;               // Decending order
//		return 0;			    // Print 1st element
	}
	
}
