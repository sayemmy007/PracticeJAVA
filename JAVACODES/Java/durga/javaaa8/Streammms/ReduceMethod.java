package Java.durga.javaaa8.Streammms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {

	
	public static void main(String[] args) {
		
//		ArrayList<Integer> l = new ArrayList<>();
//		l.add(3);
//		l.add(7);
//		l.add(8);
//		l.add(1);
//		l.add(5);
//		l.add(9);
//		System.out.println(l);
		
		
		
		List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);
		//System.out.println(numbers);
		
		
		// sum using forEach loop 
		int sum = 0;
		for(int no : numbers) {
			sum = sum+no;
		}
		System.out.println("ForEach Loop sum:"+sum);
		
		
		// sum using mapToInt()
		int sum1 = numbers.stream().mapToInt(i->i).sum();
		System.out.println(sum1);
		
		
		
		//sum using reduce() with lambda exp
		int reduceSum = numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduceSum);
		
		//sum using reduce wit Method refernece
		Optional<Integer> reduceSumWithMethodRef = numbers.stream().reduce(Integer::sum);
	    System.out.println(reduceSumWithMethodRef);
	    
	    // reduce with multiply
		int reduceMul = numbers.stream().reduce(1,(a,b)->a*b);
		System.out.println(reduceMul);
		
		// reduce for max vlaue
		int reduceMaxValue = numbers.stream().reduce(1,(a,b)->a>b? a:b);
		System.out.println(reduceMaxValue);
		
		// reduce for min value
		int reduceMinValue = numbers.stream().reduce(1,(a,b)->a>b? b:a);
		System.out.println(reduceMinValue);
	
		
		
	}
}
