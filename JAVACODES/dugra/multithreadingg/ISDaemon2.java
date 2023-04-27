package dugra.multithreadingg;

class MT11 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e) {}
			}
		}
}

public class ISDaemon2 {

	public static void main(String[] args) {
		 MT11 t = new MT11();
		 t.setDaemon(true);
		 t.start();
		 System.out.println("End of Main Thread");
	}

}
