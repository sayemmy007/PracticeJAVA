package dugra.multithreadingg.enchancement;

import java.util.concurrent.locks.ReentrantLock;

class Display {
	
	ReentrantLock l = new ReentrantLock(true); 
    public void wish(String name) {
	l.lock();  ///If we Comment Both Lines 1 and 2 then All Threads will be executed Simultaneously and Hence we will get Irregular Output
	 	for(int i=0; i<5; i++) {
	 		System.out.println("Good Morning");
	 		try{
	 			Thread.sleep(200);
	 			}
	 		catch(InterruptedException e) {}
	 		System.out.println(name);
	 	}
	 	l.unlock();//If we are Not Commenting then the Threads will be executed One by One and Hence we will get Regular Output.
	 	}
	 	}

class MT1 extends Thread{
	Display d;
	String name;
	MT1(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}


public class ReentrantLockPrac22 {

	public static void main(String[] args) {
		Display d = new Display();
		MT1 t1 = new MT1(d, "Dhoni");
		MT1 t2 = new MT1(d, "Yuva Raj");
		MT1 t3 = new MT1(d, "ViratKohli");
		t1.start();
		t2.start();
		t3.start();

	}

}
