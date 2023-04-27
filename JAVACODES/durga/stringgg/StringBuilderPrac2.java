package durga.stringgg;

public class StringBuilderPrac2 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Imran");
		String str1 = sb1.toString();
		String str2 = str1; // True (str2 is pointing to str1)(Referrence compariosn)
//		String str2 = new String(str1);//Flase(New object in heap)
//		String str2 = sb1.toString(); //False(New object create in heap)
//		String str2 = "Imran"; //False(Object create in SCP and str1 is in Heap)
		System.out.println(str1==str2);
		
		
		StringBuffer b = new StringBuffer("Imran");
		
		
		
		
		
		
		
		
		
		
	}

}
