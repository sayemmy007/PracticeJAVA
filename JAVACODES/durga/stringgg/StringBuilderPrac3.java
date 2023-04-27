package durga.stringgg;

public class StringBuilderPrac3 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Imran");
	//	sb.deleteAll(); // not availbale
	//	sb.delete(0,sb.size());  // size is for Collection
		sb.delete(0,sb.length()); // answer: Zero
	//	sb.removeAll(); // 
	}

}
