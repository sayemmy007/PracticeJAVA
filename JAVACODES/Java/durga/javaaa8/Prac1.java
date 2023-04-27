package Java.durga.javaaa8;

import java.util.function.Function;
import java.util.function.Predicate;



public class Prac1 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = i->i*i;
		System.out.println(f.apply(4)); // 16
		
		
		
		
     	
    	Predicate<Integer> p  = i->i%2==0;
		System.out.println(p.test(4));//True
		
		
	
		
//	()  -> System.out.println("Hello");	
//		(int a, int b) -> System.out.println(a+b);
//		
//		s -> s.length();
		
	
		
			
	
	}

}
