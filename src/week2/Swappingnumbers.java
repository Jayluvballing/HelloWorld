package week2;
import java.util.Scanner;

public class Swappingnumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int temp;

		System.out.println("Enter the value of X and Y");
		x = Integer.valueOf( input.nextLine() ); //take input as string and convert to integer
		y = Integer.valueOf( input.nextLine() ); // take input as string and convert to integer
		//int x = input.nextInt(); take input as integer
		//int y = input.nextInt(); take input as integer

		System.out.println("before swapping numbers: "+x +" "+ y);  

		temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping: "+x +" " + y); 

	}

}
