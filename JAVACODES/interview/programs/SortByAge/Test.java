package interview.programs.SortByAge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Java.durga.javaaa8.ParallelStream.Employee;
import Java.durga.javaaa8.Streammms.ForEach;

public class Test {
	public static void main(String[] args) {
		
//		EmployeeEntity emp1 = new EmployeeEntity(101,"Imran", 23);
//		EmployeeEntity emp2 = new EmployeeEntity(102,"Imran", 34);
//		EmployeeEntity emp3 = new EmployeeEntity(103,"Imran", 11);
		
//		List<EmployeeEntity> l = new ArrayList<>();
//	    l.add(101,"Imran",23); 
//		l.add(102,"Imran1",21);
		
//or  BUT  Below code is more consize 
	
         List<EmployeeEntity> l = new ArrayList<>();
         
         l.add(new EmployeeEntity(101,"Imran1", 23));         
         l.add(new EmployeeEntity(102,"Imran2", 21));
         l.add(new EmployeeEntity(103,"Imran3", 30));
         
                            /// using java 8 stream methods : SORTED()
//List<EmployeeEntity> sortedList = l.stream()
//                 .sorted(Comparator.comparingInt(EmployeeEntity::getAge).reversed())
//                 .collect(Collectors.toList());
//                  sortedList.forEach(System.out::println);
         
         
       
                                              //Defining a Custom Comparator with Stream.sorted()
//List<EmployeeEntity> sortedList1 = l.stream().sorted((o1, o2) -> {
//                	            if(o1.getAge() < o2.getAge())
//                	                return 1;
//                	            else if(o1.getAge() > o2.getAge())
//                	                return -1;
//                	            else return 0;
//                	        })
//                	        .collect(Collectors.toList());
//                    System.out.println(sortedList1);
//
//                	sortedList1.forEach(System.out::println);
                	
//                	for( EmployeeEntity  sl2 : sortedList1) {
//                		System.out.println(sl2);
//                	}
             
       
//                                               
//                                                   //using Collections sort() method with lambda: B-A
//      Collections.sort(l,(o1,o2)-> o2.getAge()-o1.getAge());   
//      for(EmployeeEntity e : l) {
//      	System.out.println(e);
//      }
//      
//        
//                                               //using Collections sort() method with OPERATORS
//        Collections.sort(l,(o1,o2)-> o1.getAge()<o2.getAge()?+1:o1.getAge()<o2.getAge()?-1:0);
//        for(EmployeeEntity e : l) {
//        	System.out.println(e);
//        }
        
         

                                           // using Comparator.comparing() method using Mehtod refernce
        Collections.sort(l, Comparator.comparing(EmployeeEntity::getName));
        for(EmployeeEntity e : l) {
      	System.out.println(e);
       }

        
         
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                                                          // using Comparator 
//         Collections.sort(l,new Comparator<EmployeeEntity>() {
//
//			@Override
//			public int compare(EmployeeEntity o1, EmployeeEntity o2) {
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
//         for(EmployeeEntity e : l)
//         {
//        	  System.out.println(e);
         }

	}


