package Java.durga.javaaa8.zzzMethodReference;

class Sample{
	private String s;
	Sample(String s){
		this.s=s;
		System.out.println("Constructor executed"+s);
	}
}

interface In{
	public Sample get(String s);
	}


public class TestConstructorReference {

	public static void main(String[] args) {
		
		In f = s -> new Sample(s);
		//f.get("From Lambda exp");
		In f1 = Sample::new;
		f.get("From constructor reference");

	}

}
