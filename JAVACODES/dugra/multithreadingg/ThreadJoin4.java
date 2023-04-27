package dugra.multithreadingg;

public class ThreadJoin4 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().join(); // Main thread waiting to complete Main tread: thread stuck for infinite amout of time
	}

}
