package week1;

public class Palindromnumber {

	public static void main(String[] args) {
	
		int number = 111;
		int reversed = 0;
		int remainder = 0;
		int originalnumber = number;

		while(number>0) {
		    remainder = number %10;
		    number = number /10;
		    reversed = (reversed *10) + remainder;
		}
		

	if (reversed==originalnumber)
	System.out.println("palindrome number"); 
		
	else
		System.out.println("it is not a palindrome");
	
	System.out.printf("The reverse number is %d", reversed);
	

	}
}
	

	     

   	
		

	


