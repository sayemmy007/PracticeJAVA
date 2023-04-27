package dugra.multithreadingg.enchancement;

import java.net.Socket;

class MT extends Thread{
	MT(ThreadGroup g,String name){ 
		super(g,name);
	}
	public void run() {
		System.out.println("Child Thread");
		try {Thread.sleep(5000);}
		catch(InterruptedException e) {}
	}
}

public class ThreadGroupMethods {

	public static void main(String[] args) throws Exception {
		 
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		//ThreadGroup pg2 = new ThreadGroup("Parent2Group");
		
		ThreadGroup cg =  new ThreadGroup(pg,"ChildGroup");
		ThreadGroup cg2 = new ThreadGroup(pg,"ChildChildGroup");
		ThreadGroup cg3 = new ThreadGroup(pg,"ChildGroup");
		ThreadGroup cg4 = new ThreadGroup(pg,"ChildChildGroup");
		
		Thread t1 = new Thread(pg,"ChildThread-1"); 
		Thread t2 = new Thread(pg,"ChildThread-2"); 
		Thread t3 = new Thread(pg,"ChildThread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
	  //  pg.list();
	    
//	    Thread.sleep(10000);
//	    System.out.println(pg.activeCount());
//	    System.out.println(pg.activeGroupCount());
//	    pg.list();
	    
//		g1.setMaxPriority(3);
//		Thread t3 = new Thread(g1,"3rd Thread"); // for newly thread assing priority 3
//		System.out.println(t1.getPriority());// 5
//		System.out.println(t2.getPriority());// 5
//		System.out.println(t3.getPriority());// 3
//		
//		g1.list();
//		
		
		
		
		
		
	}

}
