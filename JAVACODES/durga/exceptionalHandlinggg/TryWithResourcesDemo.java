package durga.exceptionalHandlinggg;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryWithResourcesDemo {

	public static void main(String[] args) throws Exception{
		try(FileReader fr = new FileReader("input.txt"))
		{
		 fr = new FileReader("abc.txt");
		}
	
	}

}
