package testDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<>();
			
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 3);
		
		System.out.println("map Size:" + map1.size());
		System.out.println(map1);
		
		if(map1.containsKey("A")) {
			Integer a = map1.get("A");
			System.out.println("value of A:"+a);  
		}
		
		for(String Key : map1.keySet())
		{ 
			System.out.println(Key+ ":" +map1.get(Key));
		}
		
          for(Entry<String, Integer> entry : map1.entrySet()) {
        	  System.out.println(entry.getKey()+ "=" +entry.getValue());
          }    
       		
	}
			
}





