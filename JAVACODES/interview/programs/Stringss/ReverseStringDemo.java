package interview.programs.Stringss;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		String s1 = "Imran";
		String s2 = "";
		char ch;
		
		for(int i=0; i<s1.length(); i++) {
			ch = s1.charAt(i);     //extracts each character
			s2 = ch+s2;           //adds each character in front of the existing string
		}
		System.out.println("Original: "+s1);
		System.out.println("Reserved: "+s2);
	}

}
