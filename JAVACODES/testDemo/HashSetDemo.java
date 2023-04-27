package testDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hashSet1= new HashSet<>();
		{
			hashSet1.add("Z");
		
		    hashSet1.add("B");
		    hashSet1.add("C");
		 	hashSet1.add("B");
		 	hashSet1.add("K");
			hashSet1.add("A");
			hashSet1.add("G");
			hashSet1.add("S");
			
			System.out.println(" scn"+hashSet1.contains("S"));
//			System.out.println(hashSet1);
			
		//	boolean r1 = hashSet1.add("B");
			//System.out.println(r1);
		//	boolean r2 = hashSet1.add("B");
		//	System.out.println(r2);
			
			
		//System.out.println("Contain c ? " + hashSet1.contains("A"));
		
		//hashSet1.remove("A");
		//System.out.println("Remove A:"+hashSet1);
		
	/*	for(String item : hashSet1) {
			 System.out.println(item);  // to iterate one 1 by 1
		}*/			
		}

	}

}
