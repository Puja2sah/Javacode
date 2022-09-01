package j2se.basics.controlStatements.loops;
import java.util.Scanner;


public class MultifactionTable {

	public static void main(String[] args) {
		 
		        
			//System.out.print("Enter number:");        
			//int sum = new Scanner(System.in).nextInt();
			for( int num=2; num<=10; num++) {
			 
		        for(int i=1; i <= 10; i++)
		        {
		            System.out.println(num+" * "+i+" = "+(num*i));
		        }
		    }
	}
}

