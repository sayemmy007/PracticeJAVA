package interview.programs.codes;

public class EqualsMethod  {
	
	public static void main(String[] args) {
		
	String a ="String";
	String b = "String";
//	HashDemo (String a, String b)
//	{
//		this.a=a;
//		this.b=b;
//	}
	if(a.equals(b)) {
		System.out.println("The hashcode is a: "+a.hashCode()+"  b: "+b.hashCode());
	}
	String c = "umar";
	String d = "UMAR";
	
	if(!c.equals(d)) {
		System.out.println("The hashcode is c: "+c.hashCode()+" d: "+d.hashCode());
	}
}
}