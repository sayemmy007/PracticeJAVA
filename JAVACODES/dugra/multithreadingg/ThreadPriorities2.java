package dugra.multithreadingg;

//class MyThread4 extends Thread{
//	
//	public void run(){
//		 System.out.println("Child Thread");
//	}
//}
//
//public class ThreadPriorities2 {
//
//	public static void main(String[] args) {
//		MyThread4 t = new MyThread4();
//		t.setPriority(10);
//		t.start();
//		System.out.println( );
//	
//	}
//
//}


public class ThreadPriorities2 extends Thread {

	
	public void run(){
		 System.out.println("Child Thread:"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		ThreadPriorities2 t = new ThreadPriorities2();
		t.setPriority(10);
		t.start();
		System.out.println("Main Thread:"+Thread.currentThread().getName());
	
	}

}
