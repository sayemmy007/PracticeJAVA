package durga.oops;



class Person{
	void msg() {
		System.out.println("SuperClass");
	}
}
public class SuperDemo extends Person {
	
	void msg() {
		System.out.println("ChildClass");
	}
	void display() {
		msg();
		//super.msg();
	}
	
	public static void main(String[] args) {
	
		SuperDemo sd = new SuperDemo();
		sd.display();
	
	}

}
