package testDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack1 = new Stack<>();
		
		stack1.push("America");
		stack1.push("Zimabaye");
		stack1.push("Zimabaye");
		stack1.push("Pakistan");
		stack1.push("India");
		
		System.out.println(stack1);
		
//		String poppedElement = stack1.pop();
//		System.out.println("poppedElement:"+poppedElement);
//		System.out.println(stack1);
		
		String peekElement = stack1.peek();
		System.out.println("peekELemetn: "+ peekElement);
	}

}
