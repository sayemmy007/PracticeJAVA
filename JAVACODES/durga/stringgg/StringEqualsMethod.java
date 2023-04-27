package durga.stringgg;

public class StringEqualsMethod {

	public static void main(String[] args) {
		String s1 = new String("imran");
		String s2 = new String("imran");
		System.out.println(s1==s2);
         System.out.println(s1.equals(s2));
         
         StringBuffer sb1 = new StringBuffer("imran");
 		StringBuffer sb2 = new StringBuffer("imran");
 		System.out.println(sb1==sb2);
          System.out.println(sb1.equals(sb2));
		

	}

}
