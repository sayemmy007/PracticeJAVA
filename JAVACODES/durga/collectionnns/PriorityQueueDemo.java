package durga.collectionnns;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue(15,new MyComparator4());
				q.offer("A");
				q.offer("Z");
				q.offer("L");
				q.offer("B");
				System.out.println(q);
	}
}
class MyComparator4 implements Comparator{
	public int compare(Object o1,Object o2) {
		String s1 = (String)o1;
		String s2 =o2.toString();
		return s2.compareTo(s1); // ZLBA
	}
}
