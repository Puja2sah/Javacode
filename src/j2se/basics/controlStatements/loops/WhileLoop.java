package j2se.basics.controlStatements.loops;

public class WhileLoop {

	public static void main(String[] args) {
		int  num = 100, i=1, sum =0;                //initialization
		while(i <= num) {       //while(Condition)
			sum = sum + i;
			i++;                 //iteration
			
		}
		System.out.println("Sum of  100 Natural Numbers is = " + sum);  

	}

}
