package j2se.basics.controlStatements.loops.TwpDArray;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int[] num = {34,23,81,15,49};
		
		int i,sum;
		sum=0;
		//Scanner sc = new Scanner(System.in);
		
		for (i = 0; i < 5; i++) {
			sum+=num[i];
           
 
	}
		System.out.println("Sum: "+sum);

}
}
