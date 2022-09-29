package week1;

import java.util.Scanner;


public class BigCodingFriday11 {

	public static void main(String[] args) {
Scanner calculator = new Scanner(System.in);

  
		
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		System.out.println("Press 5 for finding Square");
		System.out.println("Press 6 for finding Square root");
		System.out.println("Press 7 for finding Reciprocal");
		
		
		int operation = calculator.nextInt();
		
		operation = 0; 
		  do while (operation <= 7)
		
		
		if (operation == 1) {
			System.out.println("Enter the first number");
			float num1 = calculator.nextInt();
			System.out.println("Enter the second number");
			float num2 = calculator.nextInt();
			System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + (num1+num2));
		}
		if (operation == 2) {
			System.out.println("Enter the first number");
		float num1 = calculator.nextInt();
		System.out.println("Enter the second number");
		float num2 = calculator.nextInt();
		System.out.println(num1-num2);
		}
		if (operation == 3) {
			System.out.println("Enter the first number");
			float num1 = calculator.nextInt();
			System.out.println("Enter the second number");
			float num2 = calculator.nextInt();
			System.out.println("The product of the numbers " + (float)num1 + " and " + (float)num2 + " is = " + (float)num1*num2);
		}
		if (operation == 4) {
			System.out.println("Enter the first number");
			float num1 = calculator.nextInt();
			System.out.println("Enter the second number");
			float num2 = calculator.nextInt();
			System.out.println(num1/num2);
		}
		if (operation == 5) {
			System.out.println("Enter the first number");
			float num1 = calculator.nextInt();
			System.out.println("The Square of the number " + num1 + " is = " + num1*num1 );	
		}
		if (operation == 6) {
			System.out.println("Enter the first number");
			float num1 = calculator.nextInt();
			System.out.println(Math.sqrt(num1));
		}
		if (operation == 7) {
			System.out.println("E{nter the first number");
			float num1 = calculator.nextInt();
			System.out.println(1/num1);
		}
		
	}

}
