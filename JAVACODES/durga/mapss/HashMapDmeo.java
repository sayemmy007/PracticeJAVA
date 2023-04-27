package durga.mapss;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDmeo {

	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		try {
			m.put(null, null);}
		catch(NullPointerException e) {
			System.out.println("Arithmetic ");
			m.put("Imran",700);
			m.put("Anas", 200);
			m.put("U", 900);
			m.put("W", 100);
			
		}
		
		
//		System.out.println(m);
//		System.out.println(m.put("Imran",20000));
//		
//		Set s = m.keySet();
//		System.out.println(s);
//		
//		Collection c = m.values();
//		System.out.println(c);
//		
		Set s1 = m.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() + "=" +m1.getValue());
			if(m1.getKey().equals("Anas"))
			{
				m1.setValue(3);
			}
		}
	 System.out.println(m);
	}
				
	}

