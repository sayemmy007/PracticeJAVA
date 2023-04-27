package durga.collectionnns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10); hs.add(50); hs.add(null);hs.add(null);hs.add(null);
		hs.add(100);
		hs.add(20);
		hs.add(30);
		hs.add(null);
		hs.add(40);                                //ad()
		System.out.println("add:"+hs);
		
		
		
//		 Object[] arr = hs.toArray();                              //toArray()
//			// System.out.println(arr);
//		        System.out.println("Elements of HashSet as Array: "+ Arrays.toString(arr));
//		        
//		      
//				HashSet<Integer> hs2 = new HashSet<>();
//				hs2.add(90);
//				hs2.addAll(hs);                                       //addAll() : Collection method
//				System.out.println("addAll:"+hs2);
//				
				Iterator<Integer> it4 = hs.iterator();                 //ListIterator: hasNext(), next()
				while(it4.hasNext()) {
					System.out.println("ListIterator:"+it4.next());
				}
//				
			
//			    System.out.println("ListIteratorRemove:"+l2);
//				for(Integer i : hs) {                              //forEachLoop()
//					 System.out.println("forEachLoop:"+i);
//				 }
////		hs.remove(10);
////		System.out.println("remove:"+hs);
////		
////		hs.removeAll(hs);
////		System.out.println("removeAll:"+hs);
//		
//		boolean b = hs.contains(40);           // contain() (specified element contain or not)     
//		System.out.println("contain:"+b);
//		
//		hs.containsAll(hs);                     // Collection method: containAll (print exisiting elements)    
//		System.out.println("ContainAll:"+hs);
//		
//		
//		if(hs.equals(hs2)) {                                 //equals
//			System.out.println("Equals");
//		}else {
//			System.out.println("Not Eqauls");
//			}
//		//or
//		boolean s = hs.equals(hs2);
//		System.out.println("Equals:"+s);
//		
//		
//		System.out.println("isEmpty:"+hs.isEmpty());      //isEmpty()
//		
//		System.out.println("hashhCode:"+hs.hashCode());   // hashCode()
//		
//		System.out.println("size"+hs.size());            //size()
//		
//		hs.clear();
//		System.out.println("clear"+hs);          //clear()
	   
	

	}

}
