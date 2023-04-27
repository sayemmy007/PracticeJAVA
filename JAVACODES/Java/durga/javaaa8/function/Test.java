package Java.durga.javaaa8.function;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		Function<Integer,Integer> f = i -> i*i;
		System.out.println(f.apply(5));
		System.out.println(f.apply(2));
		
		Function<String, Integer> f1 = s -> s.length();
		System.out.println("Length of the String:" +f1.apply("Imran"));
		
		Function<String, String> f2 = s -> s.toLowerCase();
		System.out.println("String:" +f2.apply("imran"));
	}

}
