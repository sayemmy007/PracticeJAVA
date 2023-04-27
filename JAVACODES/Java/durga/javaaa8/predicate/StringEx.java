package Java.durga.javaaa8.predicate;

import java.util.function.Predicate;

public class StringEx {

	public static void main(String[] args) {
		
		String[] s = {"Imran","Muzammil","Zaid","Umar"};

		Predicate<String> p = s1 -> s1.length()<=5;
		for(String s1 : s) {
			if(p.test(s1)) {
				System.out.println(s1);
			}
		}
	}

}
