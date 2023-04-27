package durga.mapss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Imran",100);
		hm.put("Anas", 200);
		hm.put(null, null);   //only 1 null key is allowed in HashMap
		hm.put(null, null);
		hm.put("Muza", null);
		hm.put("Imran", 900);
		hm.put("Zaid", 400);                                                     //put()
		System.out.println(hm);
		

		
//		hm.put("Imran", 1);                                                  // update using:   Put()
//		System.out.println(hm);
//		hm.replace("Imran", 10000);  // update using replace()
//		System.out.println(hm);
//		
//	    hm.computeIfPresent("Imran", (key, oldValue) -> oldValue * 2);       // update using:   computeIfpresent()
//	    System.out.println("HashMap with updated value: " + hm);
	    
//		 hm.merge("Imran", 10, (oldvalue, newvalue) -> oldvalue + newvalue);  //update using:   merge()
//		 System.out.println("HashMap with updated value: " + hm);
		
		
		
//		System.out.println("get:"+hm.get("Imran"));  //get()
////		
////		hm.remove("Imran");
////		System.out.println("remove: "+hm);          //remove()
//		
//		boolean b = hm.containsKey("Imran");       //containsKey()
//		System.out.println(b);
//		boolean b1 = hm.containsValue(100);        //containsValue()
//		System.out.println(b1);
//		
//		System.out.println("Size"+hm.size());       //size()
//		System.out.println("isEmpty:"+hm.isEmpty()); //isEmpty()
//		
		
		
//		HashMap<String, Integer> hm2 = new HashMap<>();
//		hm2.put("Sayyed", 500);
//		
//		HashMap<String, Integer> hm3 = (HashMap<String, Integer>) hm.clone();   //clone()
//		System.out.println("clone:"+hm3);
//		
//	   for(Map.Entry<String, Integer> set : hm.entrySet()) {  // Map.Entry use to Iterate key value pair 
//		System.out.println(set.getKey()+":"+set.getValue()); // have 3 method: entrySet,getKey,getValue
//	     }
//			
//			
//		hm.putAll(hm2);                                 //putAll()
//		System.out.println(hm);
//		
//		
//		hm.clear();                                   //clear()
//		System.out.println(hm);
//		
//		hm2.clear();                               //clear()
//		System.out.println(hm2);
		
		
	}

}
