package j2se.basics.controlStatements.loops;

public class DiamondNestedLoop {

	public static void main(String[] args) {
		int i,j;
		for(i=1; i<=5; i++){
		    for(j=1; j<=5; j++){
		        System.out.print(j+"   ");
		    }
		    System.out.println();
		    
		}
		
		System.out.println();
		System.out.println();
		for(i=1; i<=5; i++){
		    for(j=1; j<=i; j++){
		        System.out.print(j+"   ");
		    }
		    System.out.println();
		}
		
		System.out.println();
		System.out.println();
		for(i=1; i<=5; i++){
		    for(j=1; j<=6-i; j++){
		        System.out.print(i+"   ");
		    }
		    System.out.println();
		}
		
		
		
		

	}
}






