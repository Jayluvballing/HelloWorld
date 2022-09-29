package week1;

import java.util.Scanner;

public class Displaynegativenumbers {

	public static void main(String[] args) {
		int var;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int number = scan.nextInt();
		
		if (number > 0) { 
			System.out.println("Number is positive");
		}
		else {	
		System.out.println("Number is negative");
		}

	}

}
