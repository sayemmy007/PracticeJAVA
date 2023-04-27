package Java.durga.javaaa8.ParallelStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
//import java.util.stream.Stream;


public class ParallelStreamMethodOfCollection {

	
	public static void main(String[] args)
		throws IOException
	{
	                           	                                       // Creating a File object
		File fileName = new File("C:\\Users\\Imran Laptop\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\testDemo\\src\\Java\\durga\\javaaa8\\ParallelStream\\TextFile1.txt");

		                                                             // Reading the lines of the text file by
		                                                            // create a List using readAllLines() method
		List<String> text = Files.readAllLines(fileName.toPath());

		                                                          // Creating parallel streams by creating a List
		                                                         // using readAllLines() method
		text.parallelStream().forEach(System.out::println);
	}
}
