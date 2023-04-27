package Java.durga.javaaa8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		EmployeeExamplee emp1 = new EmployeeExamplee(101,"Imran", 23);
		EmployeeExamplee emp2 = new EmployeeExamplee(102,"Imran", 34);
		EmployeeExamplee emp3 = new EmployeeExamplee(103,"Imran", 11);
		EmployeeExamplee emp4 = new EmployeeExamplee(104,"Imran", 1);
		EmployeeExamplee emp5 = new EmployeeExamplee(103,"Imran", 19);
		
	
         List<EmployeeExamplee> l = new ArrayList<>();
         l.add(emp1);
         l.add(emp2);
         l.add(emp3);
         l.add(emp4);
         l.add(emp5);
         
                                                       /// using java 8 stream methods
    List<EmployeeExamplee> sortedList = l.stream()
    		.sorted(Comparator.comparingInt(EmployeeExamplee::getAge).reversed())
    		.collect(Collectors.toList());

        sortedList.forEach(System.out::println);
         
                                                          // using Comparator 
//         Collections.sort(l,new Comparator<EmployeeExamplee>() {
//
//			@Override
//			public int compare(EmployeeExamplee o1, EmployeeExamplee o2) {
//				if (o1.getAge() > o2.getAge()) {
//					  return 1;
//					 } else if (o1.getAge() < o2.getAge()) {
//					  return -1;
//					 }
//				return 0;
//			}
//		});
//       
//    //  System.out.println(l);  
//         for(EmployeeExamplee e : l)
//         {
//        	  System.out.println(e);
         }

	}


