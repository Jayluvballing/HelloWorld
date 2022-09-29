package week1;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); //creates the object to read from the console
		
		System.out.println("Enter Username: "); //print enter username 
		
		String username = scan.nextLine(); //takes input/reads from the console
		
		System.out.println("Hello " + username); //prints hello plus inputted username
		
		scan.close();
	}
	
}
