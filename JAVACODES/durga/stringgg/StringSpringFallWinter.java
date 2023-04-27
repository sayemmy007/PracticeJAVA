package durga.stringgg;

public class StringSpringFallWinter {

	public static void main(String[] args) {
		
		 String Strobj = new String("Welcome to the world of geeks.");
//	        System.out.print("abc :");
//	        System.out.print("Output String Value :");
//	        
//	        System.out.println(Strobj.toString());
	  
		String s1 = "ABC";
		System.out.println(s1.equals("`abc"));
		//System.out.println(s1);
		
		String s2 = "ABC";
		System.out.println(s2.equalsIgnoreCase("abc"));
		//System.out.println(s1);
		
		String s3 = "   ABC";
		System.out.println(s3.trim());
		
		
		String s4 = new String("Spring");
		s4.concat("Fall");
		String s5 = s4.concat("Winter");
		s2.concat("Summer");
		System.out.println(s4);
		System.out.println(s5);

	}

}
