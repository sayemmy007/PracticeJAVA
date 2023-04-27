package durga.stringgg;

public class MaskTest {
	
	public static String mask(String creditcard) {
		String x = "XXXX-XXXX-XXXX-";
		return x+creditcard.substring(15,19);
//		StringBuilder sb = new StringBuilder(x);
//		sb.append(creditcard,15,19);
//		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(mask("1234-5678-1234-5678"));
	}

}
