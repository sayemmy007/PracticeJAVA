package interview.programs.Stringss;

public class StringBufferToString {

	public static void main(String[] args) {
		
		//StringBuffer to String
		
		StringBuffer s = new StringBuffer(" I M R A N ");
		System.out.println(s);
		String s1 = s.toString().trim();
		System.out.println(s1);
		
		
		
		//String to StringBuffer
		
		String str1 = "This is Java Weblog. ";                                      
        StringBuffer sb = new StringBuffer();
                  
        sb.append(str1);
        System.out.println(sb);
	}

}
