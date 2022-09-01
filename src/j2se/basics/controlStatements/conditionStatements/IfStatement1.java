package j2se.basics.controlStatements.conditionStatements;

import java.util.Scanner;

public class IfStatement1 {

	public static void main(String[] args){
		int menu;
		System.out.println("Cafe Menu");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccion");
		System.out.println("d. Cafe Latte");
		System.out.println("e. Hot Chocolate");
		Scanner sc = new Scanner (System.in);
		
		
	   char choice = sc.next () . charAt (0) ;
		if (choice=='a') {
			System.out.println ("Order Americano") ;
		}
		else if (choice=='b') {
		   System.out.println ("Order Cappuccino");
		}
		else if (choice=='c') {
		   System.out.println ("Order Latte") ;
		}
		else if (choice=='d') {
			System.out.println ("Order Hot Chocolate");
		}
		else if (choice=='e') {
			System.out.println ("Order ") ;
		}
		else 
			System.out.println ("Invalid Choice.");
		
		
			
			
			
		}
	}


