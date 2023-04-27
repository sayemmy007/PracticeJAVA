package Java.durga.javaaa8.zzzMethodReference;

class Student
{
	 String name;
	 int rollno;
	 int marks;
	 int age;
	 
	 Student(String name, int rollno, int marks, int age){
		 this.name=name;
		 this.rollno=rollno;
		 this.marks=marks;
		 this.age=age;
		 System.out.println("Name: "+name+" Roll: "+rollno+" Marks: "+marks+" Age: "+age);
	 }
	 }

interface InterF{
	public Student get(String name, int rollno, int marks, int age);
}

public class StudentTest {

	public static void main(String[] args) {
		
		InterF i = (name,rollno,marks,age)->new Student(name,rollno,marks,age);
		i.get("Imran", 1, 23, 22);
		InterF i1 = Student::new;
        i.get("imran", 1, 65, 24);
	}

}
