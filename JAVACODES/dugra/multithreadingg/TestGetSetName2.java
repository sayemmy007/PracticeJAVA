package dugra.multithreadingg;

class MyThread2 extends Thread{
	
	public void run() {
		System.out.println("This Line executed by Thread: "+Thread.currentThread().getName());
		Thread.currentThread().setName("Child Thread named change by programmer");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}
}



public class TestGetSetName2  {
	public static void main(String[] args) {

		MyThread2 t = new MyThread2();
	    t.start();
	    System.out.println("This Line executed by Thread: "+Thread.currentThread().getName());
	    Thread.currentThread().setName("Main Thread named change by programmer");
		System.out.println(Thread.currentThread().getName());
		
		
		
	}

}
