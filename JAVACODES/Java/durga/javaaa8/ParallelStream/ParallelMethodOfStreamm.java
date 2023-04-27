package Java.durga.javaaa8.ParallelStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;


public class ParallelMethodOfStreamm {


	public static void main(String[] args) throws IOException {

		                                           // Creating a File object
		File fileName = new File("C:\\Users\\Imran Laptop\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\testDemo\\src\\Java\\durga\\javaaa8\\ParallelStream\\TextFile.txt");

		                                        // Create a Stream of string type
		                                       // using the lines() method to
		                                      // read one line at a time from the text file
		Stream<String> text = Files.lines(fileName.toPath());

		                                    // Creating parallel streams using parallel() method
	                                    	// later using forEach() to print on console
		text.parallel().forEach(System.out::println);

		
		text.close();  // Closing the Stream  // using close() method
	}
}
