package testDemo;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		String str = "test";
		System.out.println("String is=" +str);
		
		String str1 = new String("test2");
		System.out.println("Another String is=" +str1);
		
		int arr[];
		arr = new int[3];
		arr[0]= 7;
		arr[1]= 9;
		
		System.out.println(arr);
		System.out.println(arr[2]);
	}

}
