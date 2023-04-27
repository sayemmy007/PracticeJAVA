package dugra.multithreadingg.enchancement;

public class MultiThreadingEnchancementConstructor {

	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("First Group");
		System.out.println(g.getParent().getName());
		ThreadGroup g1 = new ThreadGroup(g,"Second Group");
		System.out.println(g1.getParent().getName());
	}

}
