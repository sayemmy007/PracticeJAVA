package Java.durga.javaaa8.Streammms;


import java.util.ArrayList;

//public class CountMethod {
//
//	public static void main(String[] args) {
//		
//		ArrayList<String> l = new ArrayList<>();
//		l.add("Ia");
//		l.add("Sayy");
//		l.add("a");
//		l.add("ASSAzcS");
//		System.out.println(l);
//		
//		long count = l.stream().filter(s ->s.length()<=5).count();
//		System.out.println("number which length is less than 5 length strings is:"+count);
//	}
//}


public class CountMethod{
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		
//		long NumberOfFailedStudent = marks.stream().count();
//		System.out.println(NumberOfFailedStudent);
		
		long NumberOfFailedStudent = marks.stream().filter(s-> s>=35).count();
		System.out.println(NumberOfFailedStudent);
		
		
	}
}