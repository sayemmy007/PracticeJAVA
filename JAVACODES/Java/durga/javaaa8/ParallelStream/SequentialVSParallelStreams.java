package Java.durga.javaaa8.ParallelStream;

import java.util.stream.IntStream;

public class SequentialVSParallelStreams {

	public static void main(String[] args) {
		 
		long start = 0;
		long end = 0;
		
//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Sequential stream took time:"+(end-start));
//		
//		
//		System.out.println("===============================================");
// 
//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).parallel().forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Sequential stream took time:"+(end-start));
//		
		
		IntStream.range(1, 50).forEach(x->{
			System.out.println("Thread: "+Thread.currentThread().getName()+":"+x);
		});
		
		System.out.println("===============================================");
		
		IntStream.range(1, 50).parallel().forEach(x->{
			System.out.println("Thread: "+Thread.currentThread().getName()+":"+x);
		});
		
		
              	
	}

}
