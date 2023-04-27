package Java.durga.javaaa8.Streammms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTimeAPI {

	public static void main(String[] args) {
		
		 LocalDate datee = LocalDate.now();
		 System.out.println(datee);
		 
		 LocalTime timee = LocalTime.now();
		 System.out.println(timee);
		
		//Once we get LocalDate object we can call the following methods on that object to retrieve Day,month and year values separately.
		LocalDate date = LocalDate.now();
		System.out.println(date);
 
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.println(dd+ "..." +mm+ "..." +yy);
		System.out.printf("%d-%d-%d",dd,mm,yy);
		
		
		
		//Once we get LocalTime object we can call the following methods on that object.
		LocalTime time = LocalTime.now(); 
		int h = time.getHour(); 
		int m = time.getMinute(); 
		int s = time.getSecond(); 
		int n = time.getNano(); 
		System.out.printf("\n%d:%d:%d:%d",h,m,s,n);
		
		
		//If we want to represent both Date and Time then we should go for LocalDateTime object
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		
		//We can represent a particular Date and Time by using LocalDateTime object as follow
		LocalDateTime dt1 = LocalDateTime.of(1995,Month.APRIL,28,12,45);
		System.out.println(dt1);
		
		LocalDateTime dt2 = LocalDateTime.of(1995,04,28,12,45);
		System.out.println(dt2);
		System.out.println("After six months:"+dt2.plusMonths(6));
		System.out.println("Before six months:"+dt2.minusMonths(6));
		
		
		//To Represent Zone: ZoneId object can be used to represent Zone
		ZoneId zone = ZoneId.systemDefault(); 
		System.out.println(zone); 
		
		
		//We can create ZoneId for a particular zone as follows
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);




	}

}
