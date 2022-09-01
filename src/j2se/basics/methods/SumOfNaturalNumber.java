package j2se.basics.methods;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = new Scanner (System.in).nextInt();
		int res = sum(n);
		System.out.println("Sum of "+n+ "natural numbers: "+res);
		res = fact(n);
		System.out.println("Factorial of "+n+":"+res);
		
		
		
	}

	private static int fact(int n) {
		int res=1;
		while(n!=0) {
			res*=n;
			n--;
		}
		
		return res;
	}

	private static int sum(int n) {
		int res = 0;
		while(n!=0) {
			res+=n;
			n--;
		}
		return res;
	}
}
//		int i, num = 10, sum = 0;
//		for (i = 1; i <= num; ++i) {
//			{
//
//				sum = sum + i;
//			}
//
//			System.out.println("Sum of First 10 Natural Numbers is = " + sum);
//		}
//	}
//
//}
 