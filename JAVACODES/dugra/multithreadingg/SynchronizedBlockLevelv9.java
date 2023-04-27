package dugra.multithreadingg;

class Display101{
	public void wish(String name) {
		synchronized(Display.class) {
		for(int i=0; i<10; i++) {
			//System.out.println("Good Morning :");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			System.out.println(name);
		}
		}
	}
}

class MT101 extends Thread{
	Display101 d;
	String name;
	MT101(Display101 d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedBlockLevelv9 {

	public static void main(String[] args) {
		Display101 d1 = new Display101();
		Display101 d2 = new Display101();
		MT101 t1= new MT101(d1,"imran");
		MT101 t2= new MT101(d2,"Dhoni");		
		t1.start();
		t2.start();

	}

}
