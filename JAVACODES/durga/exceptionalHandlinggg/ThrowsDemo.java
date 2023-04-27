package durga.exceptionalHandlinggg;

import java.net.Socket;

public class ThrowsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		doStuff();
	}
	public static void doStuff() throws InterruptedException {
		doMoreStuff();
	}
	public static void doMoreStuff() throws InterruptedException {
		System.out.println("Thread");
		Thread.sleep(10000);
	}

}
