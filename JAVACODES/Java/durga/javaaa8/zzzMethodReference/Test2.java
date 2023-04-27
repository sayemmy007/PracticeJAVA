package Java.durga.javaaa8.zzzMethodReference;

interface I{
	public void m1(int a, int b);
	}


public class Test2 {

	public static void sum(int x, int y) {
		System.out.println("Sum are: "+(x+y));
	}
	public static void main(String[] args) {
	
		 I i =(a,b) -> System.out.println("Sum is:"+(a+b));  // Lambda exp.
		 i.m1(10, 20);
		 
		 Test t = new Test();
		 I i1 = Test2::sum;
		 i1.m1(100, 200);
	}

}






//interface I{
//	public void m1(int a, int b);
//	}
//
//
//public class Test2 {
//
//	public static void sum(int x, int y) {
//		System.out.println("Sum are: "+(x+y));
//	}
//	public static void main(String[] args) {
//	
//		 I i =(a,b) -> System.out.println("Sum is:"+(a+b));  // Lambda exp.
//		 i.m1(10, 20);
//		 
//		 Test t = new Test();
//		 I i1 = Test2::sum;
//		 i1.m1(100, 200);
//	}
//
//}
