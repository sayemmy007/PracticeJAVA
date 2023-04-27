package dugra.multithreadingg;

class A1{
	public synchronized void d1(B1 b) {
		System.out.println("Thread 1 starts execution of D1() Method");
	try{
		Thread.sleep(500);
		}
	catch(InterruptedException e) {
	}
		System.out.println("Thread 1 trying to call B's last() Mehtod");
		b.last();
	}
	
	public synchronized void last() 
	{
		System.out.println("Inside A, last() Method");
	}
}

class B1{
	public synchronized void d2(A1 a) {
		System.out.println("Thread 2 starts execution of D2() Method");
	try{
		Thread.sleep(500);
	}
	catch(InterruptedException e) {
	}
		System.out.println("Thread 2 trying to call B's last() Mehtod");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B, last() Method");
	}
}

 class DeadLockPrac1 extends Thread {
	A1 a = new A1();
	B1 b = new B1();
	
	public void m1() {
		this.start();
		a.d1(b); // by main thread
	}
	
	public void run() {
		b.d2(a); // by child thread
		
	}
	public static void main(String[] args) {
		
		DeadLockPrac1 d = new DeadLockPrac1();
		d.m1();
		
		
	}

}
