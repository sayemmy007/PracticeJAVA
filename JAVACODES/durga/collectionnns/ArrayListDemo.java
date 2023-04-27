package durga.collectionnns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList<Integer> l = new ArrayList<Integer>();
	
	//	l.add(null);
		l.add(10);
		l.add(20);
		l.add(30);
	//	l.add(null);
		l.add(40);
		l.add(50);  
		l.add(10); 
		//add()
		System.out.println("Add:"+l); 

		
		
			
//		 Object[] arr = l.toArray();               //toArray()
//		// System.out.println(arr);
//	        System.out.println("Elements of ArrayList as Array: "+ Arrays.toString(arr));
//	        
//	     
//		
//		ArrayList<Integer> l2 = new ArrayList<Integer>();
//		l2.add(70);
//		l2.addAll(l);                               //addAll() : Collection method
//		System.out.println("addAll"+l2);
//		
//	
//		
//		Iterator<Integer> it = l2.iterator();        // iterator hasNext(),next() & remove()    
//	    while(it.hasNext()) {
//	      Integer i = it.next();
//	      if(i == 10) {
//	        it.remove();
//	      }
//	    }
//	    System.out.println("IteratorRemove:"+l2);
//	    
//	    
//	    
		Iterator<Integer> it2 = l.listIterator();    // Listiterator: hasNext(),next() & remove()      
	    while(it2.hasNext()) {
	      Integer i = it2.next();
	      if(i == 20) {
	        it2.remove();
	      }
	    }
	    System.out.println("ListIteratorRemove:"+l);
//     
//		
//	    Iterator<Integer> iter2 = l.iterator();        //Iterator: hasNext(), next()
//		while (iter2.hasNext()) {
//			System.out.println("Iterator:"+iter2.next() + " ");
//		}
//		
//		 Iterator<Integer> iter1 = l.listIterator();     //ListIterator: hasNext(), next()
//			while (iter1.hasNext()) {
//				System.out.println("ListIterator:"+iter1.next() + " ");
//			}
//		
//		
//		
//		  for (Integer i: l) {             //forEachLoop()
//		         System.out.println("forEachloop:"+i);
//		         }
		  
		  
//			
//		
//		int size = l.size();                      // size()
//		System.out.println("Size:"+size);
//		//or
//		System.out.println("Size:"+l.size());
//		
//		
//		l.trimToSize();                          //trimToSize()  not in linkedlist
//		System.out.println("trimeToSize:"+l);
//		
//		
//		l.remove(1);                             //remove()
//		System.out.println("Remove:"+l);
//		
////		//l.removeAll(l);                     // Collection Method: removeAll
////		System.out.println(l);   
//		
//
//		l.set(0, 1);                           //set(index,value)
//		System.out.println("Set:"+l);
//		
//		int element = l.get(0);                                //get()
//		System.out.println("get:"+element);
//		//or
//		System.out.println("get:"+l.get(0));
//
//		
//		boolean b = l.contains(40);           // contain() (specified element contain or not)     
//		System.out.println("contain:"+b);
//		
//		l.containsAll(l);                     // Collection method: containAll (print exisiting elements)    
//		System.out.println("ContainAll:"+l);
//		
//		
//		l.ensureCapacity(23);                     //ensureCapacity() not in LinkedList
//		System.out.println("ensureCapacity:"+l);
//
//		
//		ArrayList<Integer> l3 =(ArrayList<Integer>) l.clone();   //clone() 
//		System.out.println("clone:"+l3);
//		
//	
//
//		System.out.println("hascode:"+l.hashCode());          //hashCode()
//		
//		int element1 = l.indexOf(30);                     //indexOf
//		System.out.println("indexOf:"+element1);
//		//or
//		System.out.println("indexOf"+l.indexOf(30));
//		
//		
//		System.out.println("lastIndexOf:"+l.lastIndexOf(30));  //lastIndexOf()
//		
//		
//		
//		boolean b1 = l.isEmpty();   System.out.println("isEmpty:"+b1);   // isEmpty()
//		
//		
//		if(l.equals(l2)) {                                 //equals
//			System.out.println("Equals");
//		}else {
//			System.out.println("Not Eqauls");
//			}
//		//or
//		boolean s = l.equals(l2);
//		System.out.println("Equals:"+s);
//		
//		l.clear();
//		System.out.println("Clear:"+l);                      //clear()
		
		
		
	
		
		

	}

	}
	
