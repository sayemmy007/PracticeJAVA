package dugra.multithreadingg;

class Display{
	public synchronized void wish(String name) {
		for(int i=0; i<3; i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			System.out.println(name);
		}
	}
}

class MT extends Thread{
	Display d;
	String name;
	MT(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MT t1= new MT(d1,"imran");
		MT t2= new MT(d2,"Dhoni");
//		MT t3= new MT(d,"raina");
//		MT t4= new MT(d,"yuv");
		
		
		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
	}

}
