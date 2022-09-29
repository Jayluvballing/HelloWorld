package week1;

public class ReverseNumber {

	public static void main(String[] args) {

			int inputNumber = 143;
			int reversedValue = 0;
			int remainderValue = 0;

			while(inputNumber>0) {
			    remainderValue = inputNumber %10;
			    reversedValue = (reversedValue *10) + remainderValue;
			    inputNumber = inputNumber /10;
			    
			}
			System.out.printf("The reverse number is %d", reversedValue);
			}


	}

