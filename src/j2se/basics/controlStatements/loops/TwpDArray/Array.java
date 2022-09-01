package j2se.basics.controlStatements.loops.TwpDArray;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*int[] num = {34,23,81,15,49};
		int[] arr = new int[5];
		//System.out.println(num[4]);
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println(num[4]);
		System.out.println("Enter 5 number: ");
		for(i=0; i<5; i++) {
			arr[i] = sc.nextInt();
			
		}System.out.println("The numbers you entered are: ");
		for(i=0; i<5; i++) {
			System.out.print(arr[i]+"\t");
		}*/
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[13];
		int i;
		//int a= 216, b=234 , c=123, d=2345,e=5678,f=2564;
		
		for(i=0; i<13; i++) {
			System.out.println("Enter the marks of "+(i+1)+ "th student:");
			marks[i]=sc.nextInt();
		}
		for(i=0; i<13; i++) {
			System.out.println("Enter the marks of "+(i+1)+ "th student:"+marks[i]);
			
	}

}
}