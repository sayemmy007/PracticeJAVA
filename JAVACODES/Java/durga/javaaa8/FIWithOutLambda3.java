package Java.durga.javaaa8;

 interface Interf4 { 
	 public int square(int x); 
 } 
 
 class Demo4 implements Interf4 { 
	 
	 public int square(int x) { 
		 return x*x; 
	 } 
 } 
 
 class FIWithOutLambda3 { 
	 public static void main(String[] args) { 
		 
		 Interf4 i = new Demo4(); 
		 System.out.println("The Square of 7 is: " +i.square(7)); 
	 } 
 } 