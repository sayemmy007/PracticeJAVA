package durga.stringgg;

public class FInalVSImmurable {

	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("Imran");
		sb.append("Sayyed");
		 //sb = new StringBuffer("Azmi"); //We cant reassign final variable to new object 
		System.out.println(sb);

	}

}
