package Java.durga.javaaa8.Streammms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Testt {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);
		
		
		List<Integer> odd = Arrays.asList(1,3,5);
		List<Integer> even = Arrays.asList(2,4,6);
		List<List<Integer>> l = Arrays.asList(odd,even);
		List<Integer> l1  = l.stream().flatMap(f -> f.stream()).collect(Collectors.toList());
		System.out.println(l1);
		
		
	}

}
