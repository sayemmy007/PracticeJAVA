package durga.stringgg;


class MyString{
	
	String msg;
	 MyString(String msg) {
		 this.msg=msg;
	}
	 public String toString(){
		 return msg;
	 }
}
public class StringHashCode2 {

	public static void main(String[] args) {
	
		 System.out.println("Hello" + new StringBuilder("JAVA SE 8"));
		 System.out.println("Helloo" + new MyString("JAVA SE 8 ABCD"));
		
	}

}
