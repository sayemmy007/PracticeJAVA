package durga.stringgg;

import java.util.Optional;

public class EmtpyString {

	public static void main(String[] args) {

		                                             // creating a string array
        String[] str = new String[5];
        
        
        System.out.println(str[1]);
                                                   // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";
  
                                                     // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
 
                                                     // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);
        
        
        
        

	}

}
