package durga.mapss;

import java.util.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Imran Laptop\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\testDemo\\src\\durga\\mapss\\abc.properties");
		p.load(fis); 
		System.out.println(p);
		String s = p.getProperty("venki");
		System.out.println(s);
		p.setProperty("nag", "88888");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos,"Updated by IMRAN for demo class");
		}

}
