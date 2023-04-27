package dugra.multithreadingg.enchancement;

public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		
		ThreadLocal t1 = new  ThreadLocal();
		System.out.println(t1.get());
		t1.set("Imran");
		System.out.println(t1.get());
		t1.remove();
		System.out.println(t1.get());
	}

}
