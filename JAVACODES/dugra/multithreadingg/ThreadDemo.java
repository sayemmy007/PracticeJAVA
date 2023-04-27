package dugra.multithreadingg;


class MyThread70 extends Thread{
	public void run() {
		 for(int i=0; i<5; i++) {
			 System.out.println("Child Thread");
		 }
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		 for(int i=0; i<5; i++) {
			 System.out.println("Main Thread");
		 }
	
	}

}
