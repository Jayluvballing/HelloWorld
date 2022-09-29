package week1;

public class heyhey {

	public static void main(String[] args) {
		
		int numbers[] = {1, 2, 3, 5,6};
		
		for (int i =0; i<numbers.length; i++) {
			if(numbers[i]%2 == 0) {
				System.out.println(numbers[i] + " is  even.");
			}
			else if (numbers[i]%2 != 0)
				System.out.println(numbers[i] + " is  odd.");	
		}

	}

}
