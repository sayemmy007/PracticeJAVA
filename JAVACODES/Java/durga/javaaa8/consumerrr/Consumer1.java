package Java.durga.javaaa8.consumerrr;
import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
	   Consumer<String> c = s -> System.out.print(s);
		c.accept("Imran");
		c.accept("Sayyed");
	}

}
