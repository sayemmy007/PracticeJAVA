package dugra.multithreadingg;


class MT10 extends Thread{
	
}
public class ISDaemon {

	public static void main(String[] args) {
	System.out.println(Thread.currentThread().isDaemon());
	//Thread.currentThread().setDaemon(true);
	
	MT10 t = new MT10();
	System.out.println(t.isDaemon());
	t.setDaemon(true);
    System.out.println(t.isDaemon());
	}

}
