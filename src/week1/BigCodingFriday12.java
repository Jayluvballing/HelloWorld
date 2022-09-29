package week1;

import java.util.Scanner;


public class BigCodingFriday12 {

	public static void main(String[] args) {
		Scanner stringmenu = new Scanner(System.in);
		
		System.out.println("Press 1 for Palindrome Check");
		System.out.println("Press 2 to reverse a String");
		System.out.println("Press 3 to Concatenate two Strings");
		System.out.println("Press 4 for String Comparison");
		System.out.println("Press 5 to Calculate the Length of String");
		
		System.out.println("Enter the option:");
		int option = stringmenu.nextInt();
		System.out.println("Enter First string: ");
		String firststring = stringmenu.nextLine();
		System.out.println("Enter Second string: ");
		String secondstring = stringmenu.nextLine();
		
		String reverse = "";
		for (int i = firststring.length() - 1; i>=0; i--) {
		    reverse += firststring.charAt(i);
	
		}
		System.out.println(reverse);
		
			
		boolean Palindrome = true;
	    	for (int i = 0; i<firststring.length(); i++) {
	        if (firststring.charAt(i) != reverse.charAt(i)){ 
	            Palindrome = false;
	        }
	    }
	    	
	    while (option == 1)
	    if (Palindrome = true)
	    {System.out.println(reverse + " is a palindrome");
	    }
	    
	    else 
	    	{System.out.print(reverse + " is not a palindrome");
	    	}
		
		if (option == 2)
		System.out.println(reverse);
		
		if (option == 3)
			System.out.println(firststring + secondstring);
		
		if (option == 4)
			if (firststring.equals(secondstring))
			{
			System.out.println("The entered strings are equal");}
			else {
			System.out.println("The entered strings are not equal");}
			
		if (option == 5) {
			System.out.println("The length of the entered is string is: " + firststring.length());
			}
	}
}


