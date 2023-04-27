package durga.stringgg;

final public class Test {

	private int i;
	Test(int i)
	{
		this.i = i;
	}
	 public Test modfiy(int i)
	 {
		 if(this.i == i)
		 {
			
			 return this;
		 }
		 else {
			
			  return new Test(i);
		 }
	 }
	 public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t3 = t1.modfiy(10);
		Test t2 = t1.modfiy(100);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
	}

}
