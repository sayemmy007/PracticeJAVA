package Java.durga.javaaa8;


class ThreadDemo { 

	public static void main(String[] args) { 
		
	Runnable r = () -> {                      //
			for(int i=0; i<10; i++) { 
				System.out.println("Child Thread"); 
			} 
}; 
	Thread t = new Thread(r); 
	t.start(); 
	for(int i=0; i<10; i++) { 
		System.out.println("Main Thread"); 
    	} 
	} 
}                                           


//class ThreadDemo { 
//	public static void main(String[] args) { 
//		
//	Thread t = new Thread(() -> { 
//		for(int i=0; i<10; i++) { 
//			System.out.println("Child Thread"); 
//		} 
//	});  
//	
//	t.start(); 
//	for(int i=0; i<10; i++) { 
//		System.out.println("Main Thread"); 
//    	} 
//	} 
//}