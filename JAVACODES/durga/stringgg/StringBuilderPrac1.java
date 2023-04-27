package durga.stringgg;

public class StringBuilderPrac1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		
		if(sb.equals(s)) {
			System.out.println("Match 1");
		}
		else if(sb.toString().equals(s.toString())) // Here, String method used so bcoz of Content Comparison
		{
			System.out.println("Match 2");
		}
		else {
			System.out.println("No Match");
		}
	}

}
