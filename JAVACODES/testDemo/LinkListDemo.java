package testDemo;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<String>();
		 
		list1.add("A");
		list1.add("B");
		list1.addFirst("Z");
		list1.addLast("Q");
		list1.add(2,"X");
		
		 System.out.println(list1);
		 
		/* list1.remove("A");
		 list1.remove(2);
		 list1.removeFirst();
		 list1.removeLast(); */
		 
		 
		
	}

}
