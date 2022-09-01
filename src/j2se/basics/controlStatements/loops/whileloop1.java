package j2se.basics.controlStatements.loops;
import java.util.Scanner;

public class whileloop1 {

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			System.out.println("Hello World");
			i++;
		}
		
		System.out.println("Enter a nubmer: ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum = 0;
		i=1;
		while(i<=n) {
			sum+=i;
		i++;
		}
		System.out.println("Sum of "+n+" natural numbers: "+sum);
		

	}

}
