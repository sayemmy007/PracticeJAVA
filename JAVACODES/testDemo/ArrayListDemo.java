package testDemo;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		 
		List<Integer> arrayList1 = new ArrayList<>(5);
		
		for(int i=1; i<=5; i++) {
			arrayList1.add(i);
		}
		System.out.println(arrayList1);
		
		arrayList1.remove(4);
		System.out.println(arrayList1);
		
		for(int i=0; i<arrayList1.size(); i++) {
			System.out.print(arrayList1.get(i)+" "); // to print wihtout square brackets
		}
	}
}
