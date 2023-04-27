package Java.durga.javaaa8;


interface InterF2 { 
 public void sum(int a,int b); 
 } 

class Demo implements InterF2 { 
 public void sum(int a,int b){ // method declaraion
	 System.out.println("Sum :" +(a+b)); // method implementatkon
 } 
 } 

public class FIWithOutLambda2 {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.sum(10, 10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		InterF2 i = new Demo();
//		i.sum(2,4);
//		i.sum(1,99);

		
	}

}
