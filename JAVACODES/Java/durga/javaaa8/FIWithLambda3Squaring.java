package Java.durga.javaaa8;

interface Interf5 { 
	 public int square(int x); 
} 


class FIWithLambda3Squaring { 
	 public static void main(String[] args) { 
		 
		 Interf5 i = x -> x*x;
		 System.out.println("The Square of 7 is: " +i.square(7)); 
		
	 } 
} 