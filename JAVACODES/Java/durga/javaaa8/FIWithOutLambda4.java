package Java.durga.javaaa8;

class MyRunnable implements Runnable { 
	
	public void run() { 
		for(int i=0; i<10; i++) { 
			System.out.println("Child Thread"); 
		} 
	} 	
	
} 

class FIWithOutLambda4 { 
	public static void main(String[] args) {
		
		Runnable r = new MyRunnable(); 
		
		Thread t = new Thread(r); 
		t.start(); 
		for(int i=0; i<10; i++) { 	
			System.out.println("Main Thread");
			} 
	} 
}