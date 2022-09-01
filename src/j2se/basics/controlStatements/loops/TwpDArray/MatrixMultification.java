package j2se.basics.controlStatements.loops.TwpDArray;
import java.util.Scanner;

public class MatrixMultification {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] p = new int [3][3];
		int i,j,k;
		for (i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				p[i][j]= 0;
				for (k=0; k<3; k++) {
					p[i][j]+= a[i][k]*b[k][j];
				}
				System.out.print(p[i][j]+ "\t");
			}
			System.out.println();
		}
		
		

	}

}
