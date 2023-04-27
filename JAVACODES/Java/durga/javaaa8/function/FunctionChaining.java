package Java.durga.javaaa8.function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = i -> 2*i;
		Function<Integer, Integer> f2 = i -> i*i*i;
		Function<Integer, Integer> f3 = i -> 34*i;
		
		System.out.println(f1.andThen(f2).apply(2));              //  4 * 4*4*4 = 64
		
		System.out.println(f1.compose(f2).apply(2));             //  8 * 2     = 16
		
		System.out.println(f1.andThen(f2).andThen(f3).apply(2));
		
		System.out.println(f1.compose(f2).compose(f3).apply(2));
	}

}
