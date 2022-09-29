package week2;
		import java.util.Scanner;

		public class test2 {

		public static void main(String[] args) {

		    Scanner myScanOperation = new Scanner(System.in);
		    Scanner myScanObj = new Scanner(System.in);
		    int operation = 0;

		    do {
		        System.out.println("Press 1 for Palindrome Check");
		        System.out.println("Press 2 to reverse a String");
		        System.out.println("Press 3 to Concatenate two Strings");
		        System.out.println("Press 4 for String Comparison");
		        System.out.println("Press 5 to Calculate the Length of String");
		       

		        operation = myScanOperation.nextInt();

		        if (operation == 1) {
		            System.out.println("Enter Word to check if Palindrome...");
		            String userInput = myScanObj.nextLine();
		            String reverseStr = new StringBuilder(userInput).reverse().toString();
		            
		            if (userInput.equals(reverseStr)) {
		                System.out.println("This is a Palindrome");
		            } else if (userInput != reverseStr) {
		                System.out.println("This is NOT a Palindrome");
		            }
		        }

		        else if (operation == 2) {
		            System.out.println("Enter a Word to see reverse...");
		            String userInput = myScanObj.nextLine();
		            String reverseStr = new StringBuilder(userInput).reverse().toString();
		            System.out.println("This is the reverse of your string = " + reverseStr);
		        }

		        else if (operation == 3) {
		            System.out.println("Enter first Word");
		            String userInputOne = myScanObj.nextLine();
		            System.out.println("Enter second Word");
		            String userInputTwo = myScanObj.nextLine();
		            System.out.println("The concat is.. + " + userInputOne + userInputTwo);
		        }

		        else if (operation == 4) {
		            System.out.println("Enter first String");
		            String userInputOne = myScanObj.nextLine();
		            System.out.println("Enter second String");
		            String userInputTwo = myScanObj.nextLine();

		            if (userInputOne.equals(userInputTwo)) {
		                System.out.println("The entered strings are equal");
		            } else {
		                System.out.println("The entered strings are NOT equal");
		            } 
		        }

		        else if (operation == 5) {
		            System.out.println("Enter a Word to see the length");
		            String userInput = myScanObj.nextLine();
		            System.out.println("The length is " + userInput.length());
		        }

		        else {
		            System.out.println("Goodbye");
		            break;
		        }

		        } while (operation <= 5);

		    }

		}



	