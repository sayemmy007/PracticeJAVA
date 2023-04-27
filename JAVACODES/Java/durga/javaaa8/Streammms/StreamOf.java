package Java.durga.javaaa8.Streammms;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		
		Stream<Integer> s= Stream.of(99,999,9999,99999);
		s.forEach(System.out:: println);
		
		
		
		Stream<Double> d1 = Stream.of(10.0,10.1,10.2,10.2);
		d1.forEach(System.out::println);
		
		//or 
		
		Double[] d2={10.0,10.1,10.2,10.3};
		Stream s1=Stream.of(d2);
		s1.forEach(System.out :: println);


	}

}
