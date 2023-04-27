package durga.collectionnns;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(10);
		l.add(null);
		l.add(20);
		l.add(30);
		l.add(null);
		l.add(40);                                             //add()
		System.out.println("add:"+l);
		
		
		
		 Object[] arr = l.toArray();                              //toArray()
		// System.out.println(arr);
	        System.out.println("Elements of LinkedList as Array: "+ Arrays.toString(arr));
//		
//
//		LinkedList<Integer> l2 = new LinkedList<>();
//		l2.add(90);
//		l2.addAll(l);                                       //addAll() : Collection method
//		System.out.println("addAll:"+l2);
//		
//		
//		Iterator<Integer> it = l2.iterator();             // iterator hasNext(),next() & remove()
//		while(it.hasNext()) {
//			Integer i = it.next();
//			if(i==10) {
//				it.remove();
//			}
//		}System.out.println("iteratorRemove:"+l2);
//		
//		
//		Iterator<Integer> it2 = l.listIterator();           //ListIterator: hasNext(), next()
//		while(it2.hasNext()) {
//			Integer i = it2.next();
//			if(i==20) {
//				it.remove();
//			}
//		}System.out.println("listIterator:"+l);
//		
//		
//		
//		Iterator<Integer> it3 = l.iterator();                //Iterator: hasNext(), next()
//		while (it3.hasNext()) {
//			System.out.println("Iterator:"+it3.next() + " ");
//		}
//		
//		Iterator<Integer> it4 = l.iterator();                 //ListIterator: hasNext(), next()
//		while(it4.hasNext()) {
//			System.out.println("ListIterator:"+it4.next());
//		}
//		
//		 for(Integer i : l) {                              //forEachLoop()
//			 System.out.println("forEachLoop:"+i);
//		 }
//		 
//		 System.out.println("Size:"+l.size());  //size()
//		 
//		
//		 l.remove(1);                             //remove()
//			System.out.println("Remove:"+l);
//			
//			l.removeFirst();
//			System.out.println(l);                //removeFirst() not in ArrayList
//			
//			l.removeLast();
//			System.out.println(l);              //removeLast() not in ArrayList
//			
////			l.removeAll(l);                     // Collection Method: removeAll
////			System.out.println(l);
//		 
//			l.set(0, 1);                           //set(index,value)
//			System.out.println("Set:"+l);
//		
//		l.add(1);l.add(2);l.add(3);l.add(4);    //add()
//		
//		System.out.println("get:"+l.get(2));
//		System.out.println("get:"+l.getFirst());
//		System.out.println("get:"+l.getLast());
//		
//		boolean b = l.contains(40);           // contain() (specified element contain or not)     
//		System.out.println("contain:"+b);
//		
//	
//		l.containsAll(l);                     // Collection method: containAll (print exisiting elements)    
//		System.out.println("ContainAll:"+l);   
//		
//		LinkedList<Integer> l3 = (LinkedList<Integer>) l.clone();  //clone()   
//		System.out.println("Clone:"+l3);
//		
//	
//		
//		
//		
//		System.out.println("hascode:"+l.hashCode());          //hashCode()
//		
//		System.out.println("indexOf:"+l.indexOf(30));         // indexOf()
//		
//		System.out.println("lastIndexOf:"+l.lastIndexOf(40));  //lastIndexOf()
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
//		l.clear();                            //clear()
//		System.out.println(l);
//		
//		
//		
//		l.add(10);l.add(20);l.add(30);l.add(40);
//		System.out.println(l);
//		
//		System.out.println(l.peek());        //This method retrieves but does not remove, the head (first element) of this list.
//		System.out.println(l.peekFirst());
//		System.out.println(l.peekLast());
//		System.out.println(l.poll());       // This method retrieves and removes the head (first element) of this list.
//		System.out.println(l.pollFirst());
//		System.out.println(l.pollLast());
//		System.out.println(l);
//		l.push(1);                        //This method pushes(adding) an element onto the stack represented by this list.
//		l.push(2);
//		System.out.println(l);
//		l.pop();                         //This method Pops(removing) an element from the stack represented by this list..
//		System.out.println(l);
		
		
	}

}
