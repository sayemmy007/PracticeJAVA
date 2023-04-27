package Java.durga.javaaa8;

interface InterF1{
	public void m1();
}

public class FIWithLambda1Hello {

	public static void main(String[] args) {
		InterF1 i = () -> System.out.println("Helloo");
		i.m1();

	}

}
