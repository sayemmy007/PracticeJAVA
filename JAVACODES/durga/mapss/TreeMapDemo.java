package durga.mapss;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//TreeMap t = new TreeMap<>();
		TreeMap t = new TreeMap(new MyComparator1());
	
	    t.put("Imran", null);
	    t.put("Zaid", 20);
	    t.put("Umar", 30);
	    t.put("Wali", 40);
	    System.out.println(t);
	    
	    
		t.put("Imran", 1);                                                  // update using:   Put()
		System.out.println(t);
		t.replace("Imran", 10000);                                         // update using:    replace()
		System.out.println(t);
		
	    t.computeIfPresent("Imran", (key, oldValue) -> 2);               // update using:      computeIfpresent()
	    System.out.println("TreeMap with updated value: " + t);
	    
		 t.merge("Imran", 101, (oldvalue, newvalue) -> newvalue);       //update using:        merge()
		 System.out.println("HashMap with updated value: " + t);
	    
	  
	    
		System.out.println("get:"+t.get("Imran"));  //get()
	
	t.remove("Imran");
	System.out.println("remove: "+t);          //remove()
	
	boolean b = t.containsKey("Imran");       //containsKey()
	System.out.println(b);
	boolean b1 = t.containsValue(100);        //containsValue()
	System.out.println(b1);
	
	System.out.println("Size:"+t.size());       //size()
	System.out.println("isEmpty:"+t.isEmpty()); //isEmpty()
	

	TreeMap<String, Integer> t2 = new TreeMap<>();
	t2.put("Sayyed", 500);
	
	TreeMap<String, Integer> t3 = (TreeMap<String, Integer>) t.clone();   //clone()
	System.out.println("clone:"+t3);
	
 		
	t.putAll(t2);                                 //putAll()
	System.out.println("putAll:"+t);
	
	
	t.clear();                                   //clear()
	System.out.println("clear t:"+t);
	
	t2.clear();                               //clear()
	System.out.println("clear t2:"+t2);
	}
}

class MyComparator1 implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
		}
}
