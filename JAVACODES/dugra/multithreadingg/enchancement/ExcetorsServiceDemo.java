package dugra.multithreadingg.enchancement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
	String name;
	
	
	PrintJob(String name) {
		this.name = name;
		}
	
	
	public void run() {
		System.out.println(name+"....Job Started By Thread:" +Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			}catch (InterruptedException e) {}
		System.out.println(name+"....Job Completed By Thread:" +Thread.currentThread().getName());
		}
	}


public class ExcetorsServiceDemo {

	public static void main(String[] args) {
		PrintJob[] jobs = {
				new PrintJob("Imran  "),
				new PrintJob("Wali   "),
				new PrintJob("Umar   "),
				};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob job : jobs) {
			service.submit(job);
			}
		service.shutdown();
		}
	


	}


