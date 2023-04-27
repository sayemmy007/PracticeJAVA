package durga.oops;
 class Animal{
}
class Monkey extends Animal{}

public class TestDemo {
	
	public void m1(Animal a) {
		System.out.println("Animal version");
	}
	public void m1(Monkey m) {
		System.out.println("Monkey veriosn");
	}

	public static void main(String[] args) {
		
		TestDemo t = new TestDemo();
		Animal a = new Animal();
		t.m1(a);
		
		Monkey m = new Monkey();
		t.m1(m);
		
	}

}
