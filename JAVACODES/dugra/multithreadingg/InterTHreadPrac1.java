package dugra.multithreadingg;

public class InterTHreadPrac1 {

	public static void main(String[] args) throws InterruptedException{
		ThreadB b = new ThreadB();
		b.start();
	//    Thread.sleep(1000);
		synchronized (b) {
		System.out.println("Main thread try to call wait method");
		b.wait(1000);
		System.out.println("Main thread got notification");
		System.out.println(b.total);
			
		}
	}
}

class ThreadB extends Thread{
	int total = 0;
	public void run() {
		synchronized(this) {
			System.out.println("Child thread starts calculation");
			for(int i=1; i<=100; i++)
		{
				
			total = total + i;
		}
			System.out.println("Child givig notification call");
		 
		this.notify();
	}
 }
}