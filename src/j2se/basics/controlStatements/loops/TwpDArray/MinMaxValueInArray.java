package j2se.basics.controlStatements.loops.TwpDArray;

public class MinMaxValueInArray {

	public static void main(String[] args) {
		int num[] = {7,5,6,9,2};
		int i,min, max = 0;
		min = num[0];
		max =  num[0];
	     
	      for(i=1; i<5; i++ ) {
	    	  min = num[i];
	         if(min>num[i]) {
	            
	         }
	         if(max<num[i]) {
	        	 max = num[i];
	         }
	      }
	      System.out.println("Min: "+min);
	      System.out.println("Min: "+max);
	}
}
	
	


