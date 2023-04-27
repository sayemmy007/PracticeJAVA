package testDemo;

public class ExplicitDataTypeConversion {

	public static void main(String[] args) {
		
    double a = 50.34;
    System.out.println("Double Representation=" +a);
    
    float b = (float)a;
    System.out.println("Float rep="+b);
    
    int c = (int)b;
    System.out.println("int rep="+c);
 	}

}
