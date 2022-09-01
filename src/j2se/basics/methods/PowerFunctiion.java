package j2se.basics.methods;

import java.util.Scanner;

public class PowerFunctiion {

	public static void main(String[] args) {
		int a,b;
		int n;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner (System.in);
		n= sc.nextInt();
		
		
		if(isPrime(n)) {
			System.out.println("Prime");
		}else {
			System.out.println("Composite");
		}
		
		
		
	
		System.out.println("Enter a number: ");
		//Scanner sc = new Scanner (System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int res = power(a,b);
		System.out.println("Result:" +res);
		
		
	}

	private static int power(int a, int b) {
		int res=1;
		while(a!=0) {
			res*=b;
			a--;
		}
		  
        
		
		return res;
	}
	static boolean isPrime(int num) {
		for(int i=2; i<(num/2); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
