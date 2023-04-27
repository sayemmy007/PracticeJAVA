package dugra.multithreadingg;


class MyThread5 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
		System.out.println("Child Thread");
		Thread.yield();
		}
	}
}
public class ThreadYeild {

	public static void main(String[] args) {
		
		MyThread5 t = new MyThread5();
		t.start();
		for(int i=0; i<10; i++) {
		System.out.println("Main Thread");
		}
		
	}

}
