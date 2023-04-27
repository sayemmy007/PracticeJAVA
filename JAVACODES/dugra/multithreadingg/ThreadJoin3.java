package dugra.multithreadingg;


class MyThread8 extends Thread{
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
public class ThreadJoin3 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread8.mt  = new MyThread8();
		MyThread8 t = new MyThread8();
		t.start();
		t.join(); //Deadlock Situation occcur bcoz both Thread wait for each other to execute
		for(int i=0; i<10; i++) {
		System.out.println("Main Thread");
		Thread.sleep(2000);
		}
		
	}

}
