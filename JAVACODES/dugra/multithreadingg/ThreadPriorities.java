package dugra.multithreadingg;

class MyThread3 extends Thread{
	
}

public class ThreadPriorities {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		
	}

}
