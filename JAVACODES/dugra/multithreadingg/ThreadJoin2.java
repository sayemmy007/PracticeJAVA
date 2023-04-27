package dugra.multithreadingg;


class MyThread7 extends Thread{
	static Thread mt;
	public void run() {
		
		try {
			mt.join();
		}catch(InterruptedException e) {
			for(int i=0; i<10; i++) {
				System.out.println("Child Thread"); // child thread 
		}
		}
	}
}
public class ThreadJoin2 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread7.mt  = new MyThread7();
		MyThread7 t = new MyThread7();
		t.start();
		
		for(int i=0; i<10; i++) {
		System.out.println("Main Thread");
		Thread.sleep(2000);
		}
		
	}

}
