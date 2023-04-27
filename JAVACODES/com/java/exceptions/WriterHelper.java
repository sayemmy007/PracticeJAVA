package com.java.exceptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriterHelper {
	
	public void writeList() {
		try {
			List<Integer> list = new ArrayList<>(10);
			list.add(1);
			Integer a = list.get(1);
			System.out.println("accessing the 1st element: "+a);
		}catch(IndexOutOfBoundsException e) {
			System.err.println("caught IndexOutOfBoundsException:"+e.getMessage());
		}finally {
			System.out.println("this will always be executed");
		}
	}
	

	public static void main(String[] args) {
		
   WriterHelper help = new WriterHelper();
   		help.writeList();

	}

}
