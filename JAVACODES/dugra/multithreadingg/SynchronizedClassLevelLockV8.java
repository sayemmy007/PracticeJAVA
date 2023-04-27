package dugra.multithreadingg;

class Display1{
	public static synchronized void displayn() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
	public static synchronized void displayc() {
		for(int i=65; i<=75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}	
}

class MT1 extends Thread{
	Display1 d;
	MT1(Display1 d){
		this.d=d;
	}
	public void run()
	{
		d.displayn();
	}
}
class MT2 extends Thread{
	Display1 d;
	MT2(Display1 d){
		this.d=d;
	}
	public void run()
	{
		d.displayc();
	}
}



public class SynchronizedClassLevelLockV8 {

	public static void main(String[] args) {
		
		Display1 d1 = new Display1();
		//Display1 d2 = new Display1();
		MT1 t1 = new MT1(d1);
		MT2 t2 = new MT2(d1);
		t1.start();
		t2.start();
		
				
		
	}

}
