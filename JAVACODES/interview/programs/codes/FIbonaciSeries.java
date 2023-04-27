package interview.programs.codes;

public class FIbonaciSeries {

	public static void main(String[] args) {
		
		int n=10;
		int a=0,b=1,sum;
		System.out.print(a+" "+b);
		
		for(int i=1; i<=n; i++) {
			sum = a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}

	}

}
