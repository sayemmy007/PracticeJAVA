package durga.stringgg;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = new String("java");
		if(s1.equals(s2)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
	}

}
