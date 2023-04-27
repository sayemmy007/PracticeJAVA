package Java.durga.javaaa8.zzzMethodReference;

import com.java.am.Main;

//public class Test {                          // using lambda exp.
//
//	public static void main(String[] args) {
//		
//		 Runnable r = () -> {
//			 for(int i=0; i<10; i++)
//			 {
//				 System.out.println("Child Thread");
//			 } 
//	};
//	Thread t = new Thread(r);
//	t.start();
//	for(int i=0; i<10; i++) {
//		System.out.println("Main Thread");
//	}}}


//class Test{                                   // using :: Method reference in STATIC method
//	public static void m1() {
//		for(int i=0; i<10; i++) {
//			System.out.println("Child Thread");
//}}
//		public static void main(String[] args) {
//			
//			
//			Runnable r = Test ::m1;
//			Thread t = new Thread(r);
//			t.start();
//			for(int i=0; i<10; i++) {
//				System.out.println("Main Thread");
//		}
//	}
//}



class Test{                                   // using :: Method reference in Instance method
	public void m1() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
}}
		public static void main(String[] args) {
			
			Test t1 = new Test();
			Runnable r = t1::m1;
			Thread t = new Thread(r);
			t.start();
			for(int i=0; i<10; i++) {
				System.out.println("Main Thread");
		}
	}
}