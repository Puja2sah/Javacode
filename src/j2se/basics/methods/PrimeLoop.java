package j2se.basics.methods;

import java.util.Scanner;

public class PrimeLoop {

	public static void main(String[] args) {
		int i = 2, num, count = 0; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter any Value : ");
		num = sc.nextInt();	
		
		
		while(i <= num/2)
		{
			if(num % i == 0)
		    {
				count++;
		        break;
		    }
			i++;
		}
		if(count == 0 && num != 1 )
		{
			System.out.println("Prime: "+num);
		}else {
			System.out.println(" Not Prime: "+num);
			
		}
		


	}

}
