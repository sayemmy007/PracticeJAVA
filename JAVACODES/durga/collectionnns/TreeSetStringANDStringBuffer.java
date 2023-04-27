package durga.collectionnns;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringANDStringBuffer {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator2());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("ABCDJDJDJ");
        t.add("XX");
        t.add("");
        
     
        System.out.println(t);    
	}
}

class MyComparator2 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int I1 = s1.length();
		int I2 = s2.length();
		if(I1 < I2)
			 return -1;
		else if(I1 > I2)
			 return +1;
		else
     	return s1.compareTo(s2); // Alphabetic order

	}
}
