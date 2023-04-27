package string;

public class Split {
 public static void main(String[] args) {
	 String str = "The quick brown fox jumps over the lazy dog";
	 String[] words = str.split(" ");
	 for (String word : words) {
	     System.out.println(word);
	 }

}
}
