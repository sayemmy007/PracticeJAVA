package dugra.multithreadingg;


class MyThread6 extends Thread{
	public void run() {
		for(int i=1; i<5; i++) {
		System.out.println("Child Thread 1:"+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		}
		
		
	}
}

class MyThread61 extends Thread{
	public void run() {
		for(int i=5; i<10; i++) {
		System.out.println("Child Thread 2:"+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		}
		
		
	}
}

public class ThreadJoin1 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread6 t = new MyThread6();
		MyThread61 t1 = new MyThread61();
		t.start();
		t.join();
		t1.start();
		t1.join();
		for(int i=10; i<=15; i++) {
		System.out.println("Main Thread:"+i);
		Thread.sleep(1000);
		}
		
	}

}
