package testDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
		
		
		queue.add("Z");
		queue.add("A");
		queue.add("B");
		queue.add("a");
		queue.add("z");
		System.out.println(queue.toString());
		
		
		queue.remove();
		System.out.println(queue);
		
	}

}
