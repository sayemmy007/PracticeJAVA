package testDemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> TreeSet1= new TreeSet<>();
		{
			TreeSet1.add("Z");
		
		    TreeSet1.add("B");
		    TreeSet1.add("C");
		 	TreeSet1.add("B");
		 	TreeSet1.add("K");
			TreeSet1.add("A");
			TreeSet1.add("G");
			TreeSet1.add("S");
			
			System.out.println(TreeSet1);
	}

}
}
