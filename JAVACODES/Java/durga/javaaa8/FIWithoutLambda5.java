package Java.durga.javaaa8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{
	public int compare(Integer I1, Integer I2) {
		if(I1<I2)
		{ 
			return -1;	
		}
		else if(I1>I2) {
			return +1;
		}
		else {
			return 0;
		}
	}
}

public class FIWithoutLambda5 {

	public static void main(String[] args) {
		 
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(30);
		l.add(0);
		l.add(15);
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		System.out.println(l);
	}

}
