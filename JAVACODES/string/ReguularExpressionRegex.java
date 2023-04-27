package string;

public class ReguularExpressionRegex {

	public static void main(String[] args) {
		String str = "Hello, World!";
		boolean match = str.matches("Hello.*");
		System.out.println(match); // output: true
		
		
		String str1 = "The quick brown fox jumps over the lazy dog";
		String[] words = str1.split("\\s+"); //using the regular expression "\s+" as the delimiter.
		for (String word : words) {
		    System.out.println(word);
		}

	}

}
