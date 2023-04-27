package dugra.multithreadingg.enchancement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread {
	
	static ReentrantLock l = new ReentrantLock();
	MyThread(String name) {
		super(name);
		}
	
	public void run() 
		{
		do {
			try {
				if(l.tryLock(1000, TimeUnit.MILLISECONDS)) {
				
					System.out.println(Thread.currentThread().getName()+"------- Got Lock");
					Thread.sleep(5000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+"------- Releases Lock");
					break;
					}else {
						System.out.println(Thread.currentThread().getName()+"------- Unable To Get Lock And Will Try Again");
						}
				}catch(InterruptedException e) {}
			}while(true);
			}
	}


class TryLockDemo{
	public static void main(String args[]) {
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		t1.start();
		t2.start();
		}
}