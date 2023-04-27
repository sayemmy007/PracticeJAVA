package Java.durga.javaaa8;

//interface Interf { 
//	public void m1(); 
//	}
//
//public class FIWithLambda6ThisKeyword {
//	int x = 777;
//	public void m2() {
//		Interf  i = () -> { int x = 888;
//		                    System.out.println(x);
//		                    System.out.println(this.x); // refer currrent outerclass object = 777
//		                     x = 123;
//		                    System.out.println(x);
//		                    
//		                    };
//		                    i.m1();
//	}
//	public static void main(String[] args) {
//		
//		FIWithLambda6ThisKeyword t = new FIWithLambda6ThisKeyword();
//				t.m2();	
//	}
//}





interface Interf { 
	public void m1(); 
	}

public class FIWithLambda6ThisKeyword {
 
	int x = 10;

	public void m2() {
		Interf  i = () -> { 
							int y = 20;
		                    System.out.println(x);
		                    System.out.println(y); 
		                	int x = 10;
		                    System.out.println(x);
		                    y = 999;
		                    System.out.println(y);
		                     };
		                    i.m1();
		             int  y = 777;
		             
		             System.out.println(y);
	}
	public static void main(String[] args) {
		FIWithLambda6ThisKeyword t = new FIWithLambda6ThisKeyword();
				t.m2();
	}
}
