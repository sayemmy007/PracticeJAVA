package Java.durga.javaaa8;

interface InterF{
	public void m1();
}

class ClassTest implements InterF{
	public void m1() {
		System.out.println("hello");
	}
}

public class FIWithOutLambda1 {

	public static void main(String[] args) {
		
		ClassTest t = new ClassTest();
		t.m1();
		
		InterF i = new ClassTest();  // (also valid) Parent reference can be used to Hold Child object
		i.m1();
	}

}
