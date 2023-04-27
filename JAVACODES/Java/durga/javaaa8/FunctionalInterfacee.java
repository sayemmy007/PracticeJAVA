package Java.durga.javaaa8;

@FunctionalInterface

 interface FunctionalInterfacee {
	
    
		public void m1();  // FI can have only 1 abstract method
		
		default void m2() { System.out.println ("jkcbz");} 
		default void m3() { System.out.println ("jkcbz");}   // FI can have many default and Static method with implementation.
		
		public static void m4() {}
		public static void m5() {}
		
	 } 

@FunctionalInterface
  	interface FunctionalInterfacee2 extends FunctionalInterfacee {
	
	public void m1(); 
	default void m2() { System.out.println ("jkcbz");} 
	default void m3() { System.out.println ("jkcbz");}   // FI can have many default and Static method with implementation.
	
	public static void m4() {}
	public static void m5() {}
	
   
	
	// public void m10();                                   //  Child interface cannot contain new abstract method
	default void m6() { System.out.println ("jkcbz");}    // but can contain new default and staic method
	public static void m7() {}
	
	
}


interface FunctionalInterfacee3{                      // normal interface can contain old and new abstarct method
	  public void m1();
	  public void m10();                             //  
	  
		default void m6() { System.out.println ("jkcbz");}    // can contain new default and staic method
		public static void m7() {}
}
