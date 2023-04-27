package Java.durga.javaaa8.zzzMethodReference;

import java.util.ArrayList;

public class CountMethod {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		l.add("Imra");
		l.add("Sayy");
		l.add("a");
		l.add("ASSAzcS");
		System.out.println(l);
		long count = l.stream().filter(s ->s.length()<=5).count();
		System.out.println("the number of 5 length strings is:"+count);

	}

}
