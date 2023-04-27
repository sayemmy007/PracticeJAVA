package interview.FilterBySalary;
		 
import java.util.ArrayList;		
import java.util.List;
		  
		public class FilterBySalary {
		    public static void main(String a[]) {
		    	
	List<EmployeeSalary> empList = new ArrayList<>();
		        
	empList.add(new EmployeeSalary("Imran",  8000));
	empList.add(new EmployeeSalary("Anas",  15000));
    empList.add(new EmployeeSalary("Wali",   2500));
    empList.add(new EmployeeSalary("Umarr", 12500));
		                                               // find Employees whose salaries are above 10000
   empList.stream().filter(emp->emp.getSalary() > 10000).forEach(System.out::println);
		        
		        
		    }
		
	}


