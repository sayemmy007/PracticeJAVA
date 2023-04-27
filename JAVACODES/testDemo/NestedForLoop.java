package testDemo;

public class NestedForLoop {

	public static void main(String[] args) {
		
		int arr[][] = {{2,4,6},{4,7,9},{9,6,3}};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
