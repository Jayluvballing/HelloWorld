package week1;

public class addarray {

	public static void main(String[] args) {
		
		int [] numbers = {14, 20, 30, 19};
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
		
			sum = sum + numbers[i];

	}
	System.out.println(sum);
}
}