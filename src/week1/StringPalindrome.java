package week1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner instance = new Scanner(System.in);

		System.out.println("Enter userinput: ");

		String userinput = instance.nextLine();

		String reverse = "";
		for (int i = userinput.length() - 1; i>=0; i--) {
		    reverse = reverse + userinput.charAt(i);
		  
		}
		
		if (userinput.equals(reverse))
			
		  {System.out.println("Palindrome");
		    }
		    
		    else 
		    	{System.out.print("not a palindrome");
		    	}
		
		instance.close();
	}
}


