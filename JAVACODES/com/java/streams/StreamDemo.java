package com.java.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
	
		List<Integer> numberList = new ArrayList<>();
			
		    numberList.add(10);
		    numberList.add(20);
		    numberList.add(30);
//		
//		 List<Integer> squareList = new ArrayList<>();
//		 for(Integer i : numberList) {
//			 squareList.add(i*i);
//		   }
//		 System.out.println(squareList);

//		 List<Integer> squareList = numberList.stream().map(x -> x*x).collect(Collectors.toList());
//		  System.out.println(squareList);
		   
//	     Set<Integer> squareSet = new HashSet<>();
//			 for(Integer i : numberList) {
//				 squareSet.add(i*i);			 
//		   }
//			 System.out.println(squareSet);	
			 
//			 Set<Integer> squareSet = numberList.stream().map(x -> x*x).collect(Collectors.toSet());
//			   System.out.println(squareSet);
		    
		    
		    List<String> languages = new ArrayList<>();
		    languages.add("java");
		    languages.add("python");
		    languages.add("scala");
		    languages.add("A");
//		    List<String> filterResult = new ArrayList<>();
//		    for(String s : languages) {
//		    	if(s.startsWith("p")) {
//		    		filterResult.add(s);
//		    	}		 	    	 		    
//	          }	System.out.println(filterResult);
//		    
		    
//		    List<String> filterResult = languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
//		    System.out.println("filter Result: " +filterResult);
		    
//		    List<String> sortedResult = languages.stream().sorted().collect(Collectors.toList());
//		    System.out.println("SORTED Result: " +sortedResult);
//		    
// 		    languages.stream().forEach(y->System.out.println("Element is:"+y));
		    
		    int sum = numberList.stream().reduce(0,(ans,i)->ans+i);
		    System.out.println("Sum of all elemnts "+sum);
       }
	   
	    
}
