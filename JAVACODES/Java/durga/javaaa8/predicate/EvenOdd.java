package Java.durga.javaaa8.predicate;


import java.util.function.Predicate;

public class EvenOdd {

	public static void main(String[] args) {
		
		int[] x = {0,5,16,24,23,78,10,29};
		Predicate<Integer> p1 = i -> i%2==0;
		Predicate<Integer> p2 = i -> i>10;
		System.out.println("Number which are even and > 10 are:");
		for(int x1 : x){
			if(p1.negate().test(x1)) {                      //and(), or(), negate().
				System.out.println(x1);
			}
		}
	}

}