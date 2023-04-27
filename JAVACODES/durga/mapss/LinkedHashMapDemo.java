package durga.mapss;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("Imran", 100);
		lhm.put("Imran",100);
		lhm.put("Anas", 200);
		lhm.put(null, null);   //only 1 null key is allowed in HashMap
		lhm.put(null, null);
		lhm.put("Muza", 300);
		lhm.put("Zaid", null);                                                     //put()
		System.out.println(lhm);
		
		lhm.put("Imran", 1);                                                  // update using:   Put()
		System.out.println(lhm);
		lhm.replace("Imran", 10000);                                         // update using:    replace()
		System.out.println(lhm);
		
	    lhm.computeIfPresent("Imran", (key, oldValue) -> oldValue * 2);       // update using:   computeIfpresent()
	    System.out.println("LinkedHashMap with updated value: " + lhm);
	    
		 lhm.merge("Imran", 10, (oldvalue, newvalue) -> oldvalue + newvalue);  //update using:   merge()
		 System.out.println("LinkedHashMap with updated value: " + lhm);
		 
		
		System.out.println("get:"+lhm.get("Imran"));  //get()
//		
//		lhm.remove("Imran");
//		System.out.println("remove: "+lhm);          //remove()
		
		boolean b = lhm.containsKey("Imran");       //containsKey()
		System.out.println(b);
		boolean b1 = lhm.containsValue(100);        //containsValue()
		System.out.println(b1);
		
		System.out.println("Size"+lhm.size());       //size()
		System.out.println("isEmpty:"+lhm.isEmpty()); //isEmpty()
		
		LinkedHashMap<String, Integer> lhm2 = new LinkedHashMap<>();
		lhm2.put("Sayyed", 500);
		
		LinkedHashMap<String, Integer> lhm3 = (LinkedHashMap<String, Integer>) lhm.clone();   //clone()
		System.out.println("clone:"+lhm3);
		
	   for(Entry<String, Integer> set : lhm.entrySet()) {  // Map.Entry use to Iterate key value pair 
		System.out.println(set.getKey()+":"+set.getValue()); // have 3 method: entrySet,getKey,getValue
	     }
			
			
		lhm.putAll(lhm2);                                 //putAll()
		System.out.println(lhm);
		
		
		lhm.clear();                                   //clear()
		System.out.println(lhm);
		
		lhm2.clear();                               //clear()
		System.out.println(lhm2);
	}
	
	

}
