package week2;

		import java.util.Scanner;

		public class test {

		public static void main(String[] args) {

		    Scanner myCalculator = new Scanner(System.in);
		    int operation = 0;
		    
		    do {
		    System.out.println("Press 1 for addition");
		    System.out.println("Press 2 for subtraction");
		    System.out.println("Press 3 for multiplication");
		    System.out.println("Press 4 for division");
		    System.out.println("Press 5 for finding Square");
		    System.out.println("Press 6 for finding Square root");
		    System.out.println("Press 7 for finding Reciprocal");

		    operation = myCalculator.nextInt();

		    if (operation == 1) {
		        System.out.println("Enter first number...");
		        float num1 = myCalculator.nextInt();
		        System.out.println("Enter second number...");
		        float num2 = myCalculator.nextInt();
		        System.out.println("num 1 + num 2 = " + (num1 + num2));
		    }

		    else if (operation == 2) {
		        System.out.println("Enter first number...");
		        float num1 = myCalculator.nextInt();
		        System.out.println("Enter second number...");
		        float num2 = myCalculator.nextInt();
		        System.out.println("num 1 - num 2 = " + (num1 - num2));
		    }

		    else if (operation == 3) {
		        System.out.println("Enter first number...");
		        float num1 = myCalculator.nextInt();
		        System.out.println("Enter second number...");
		        float num2 = myCalculator.nextInt();
		        System.out.println("num 1 * num 2 = " + (num1 * num2));
		    }

		    else if (operation == 4) {
		        System.out.println("Enter first number...");
		        float num1 = myCalculator.nextInt();
		        System.out.println("Enter second number...");
		        float num2 = myCalculator.nextInt();
		        System.out.println("num 1 / num 2 = " + (num1 / num2));
		    }
		    
		    else if (operation == 5) {
		        System.out.println("Enter first number...");
		        float num1 = myCalculator.nextInt();
		        System.out.println("num 1 squared = " + (num1*num1));
		    }

		    else if (operation == 6) {
		        System.out.println("Enter first number...");
		        float num1 = myCalculator.nextInt();
		        System.out.println("num1 square root = " + Math.sqrt(num1));
		    }

		    else if (operation == 7) {
		        System.out.println("Enter first number...");
		        float num1 = myCalculator.nextInt();
		        System.out.println("num1 reciprocal = " + 1/num1);
		    }

		    else {
		        System.out.println("Goodbye!");
		        break;
		    }

		        } while (operation > 7);

		    }

		



	}


