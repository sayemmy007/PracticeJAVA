package string;

public class Substring {

	public static void main(String[] args) {
		String str = "Hello, World!";
		String newStr = str.replace("World", "Universe");
		System.out.println(newStr); // output: "Hello, Universe!"
		
		String str1 = "The quick brown fox jumps over the lazy dog";
		String newStr1 = str1.replaceAll("the", "a");
		System.out.println(newStr1); // output: "The quick brown fox jumps over a lazy dog"

	}
}
