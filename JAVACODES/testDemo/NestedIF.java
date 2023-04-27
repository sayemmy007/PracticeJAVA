package testDemo;

public class NestedIF {

	public static void main(String[] args) {
	
		int i = 50;
		
		if(i == 50) {
			System.out.println("i is 50");
			if(i < 70) {
				System.out.println("i is smaller than 70");
				if(i < 55) {
					System.out.println("i is also smaller than 50");
				}
			}
		

	}

}
}