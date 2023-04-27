package dugra.multithreadingg;

class MyThread extends Thread{
}
public class TestGetSetName {

	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName());  //main
		
		MyThread t = new MyThread();
	    System.out.println(t.getName());// Thread - 0
		
		Thread.currentThread().setName("Main Thread name change by programmer");
		System.out.println(Thread.currentThread().getName());
		
	//	System.out.println(10/0);
		
		
		
	}

}
