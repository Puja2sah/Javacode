package j2se.basics.controlStatements.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a nubmer: ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int fact = 1;
		int i=1;
		while(i<=n) {
			fact*=i;
			i++;
		}
		System.out.println("factorial of "+n+" : "+fact);

	}

}
