package interview.programs.codes;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int r;
		int sum=0;
		
		while(temp>0) {
			r = temp % 10;
			temp = temp / 10;
			sum = sum + r*r*r;
		}
		
		if(n==sum) {
			System.out.println("Armstrong no:"+sum);
		}else {
			System.out.println("Not Armstrong no:"+sum);
		}
	}

}


//public class ArmstrongNumber {
//    public static void main(String[] args) {
//        for (int i = 0; i <= 999; i++) {
//            if (isArmstrong(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//
//public static boolean isArmstrong(int num) {
////	int temp = num;
////	int r;
////	int sum=0;
////
////	while(num>0) {
////		r = num % 10;
////		num = num / 10;
////		sum = sum + r*r*r;
////	}
////	return sum==temp;
////  }
////}
//int sum = 0;
//int original = num;
//while (num != 0) {
//  int digit = num % 10;
//  num /= 10;
//  sum += Math.pow(digit, 3);
// 
//}
//return sum == original;
//}
//}
//
