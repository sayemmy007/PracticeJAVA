package dugra.multithreadingg;


class MyThread10 extends Thread{
	public void run() {
	
			for(int i=0; i<10; i++)
			{
				System.out.println("i am lazy thread");
				
			}
			System.out.println("I want to sleep");
			try {
				Thread.sleep(2000);
			}
	
		catch(InterruptedException e) {
			System.out.println("I got Interrupted");
			
		}
	}
}
public class ThreadInterruptedSleep2 {

	public static void main(String[] args) {
		MyThread10 t = new MyThread10();
		t.start();
		t.interrupt();
		System.out.println("End of Main");
		
	}

}
