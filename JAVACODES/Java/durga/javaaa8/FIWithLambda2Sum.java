package Java.durga.javaaa8;

@FunctionalInterface
interface InterF3 { 
	
	 public abstract void sum(int a,int b); // method declaration
	 
  
    // public void MUL(int a,int b); // method declaration
   
} 


	public class FIWithLambda2Sum {

		public static void main(String[] args) {
			
			
			InterF3 i = (a,b) -> System.out.println("Sum:" +(a+b)); 
			i.sum(10,20);
		}

	}
	
	
	
	
	
	
	
	

	
	
	