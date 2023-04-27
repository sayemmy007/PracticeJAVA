package dugra.multithreadingg;


class MyThread9 extends Thread{
	public void run() {
		try {
			for(int i=0; i<10; i++)
			{
				System.out.println("i am lazy thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("I got Interrupted");
			
		}
	}
}
public class ThreadInterruptedSleep {

	public static void main(String[] args) {
		MyThread9 t = new MyThread9();
		t.start();
		t.interrupt();
		System.out.println("End of Main");
		
	}

}
