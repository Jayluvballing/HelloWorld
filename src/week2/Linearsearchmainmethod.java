package week2;

public class Linearsearchmainmethod {

	public static void main(String[] args) {
		int key = 15;
		int ind = -1;
		
		int [] array = {3, 8, 4, 2 ,12,16};
		
		for(int i = 0; i<array.length; i++) {
			if (key == array[i]) {
				ind = i;
				break; //breaks out from the loop
			}
		}
		System.out.println("Index : " + ind);
	}

}
