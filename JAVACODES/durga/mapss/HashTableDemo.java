package durga.mapss;

import java.util.Hashtable;

//public class HashTableDemo {
//
//	public static void main(String[] args) {
//		
//		Hashtable h = new Hashtable();
//		h.put(new Temp1(5), "A");
//		h.put(new Temp1(2), "B");	
//		h.put(new Temp1(6), "C");
//		h.put(new Temp1(15), "D");
//		h.put(new Temp1(23), "E");
//		h.put(new Temp1(16), "F");
//		System.out.println(h);
//	}
//}
//
//class Temp1{
//	int i;
//	Temp1(int i)
//	{ 
//		 this.i=i;
//	}
//	public int hashCode()
//	{
//		return i;
//	}
//	public String toString()
//	{
//		return i+"";
//	}
//}




public class HashTableDemo{
	private static final int Nav = 0;

	public static void main(String[] args) {
		
		Hashtable<String, Integer> marks = new Hashtable<>();
		
		marks.put("Naveen", 100); 
		
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
		marks.put("Robby", 6);
		marks.put("Aa", 2112);
		marks.put("BB", 2);
		
		
	
		
		//marks.put("Test", null);
		
//		System.out.println(marks.get("Naveen"));
//		System.out.println(marks.get("Lisa"));
//		System.out.println(marks.get("Peter"));
//		System.out.println(marks.get("Robby"));
//		System.out.println(marks.get("Aa"));
//		System.out.println(marks.get("BB"));
		
		String s1 = "Aa";
		String s2 = "BB";
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		
//		
		
		
	}
}
