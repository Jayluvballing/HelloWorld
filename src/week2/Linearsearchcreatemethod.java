package week2;

public class Linearsearchcreatemethod { //separate method so it can be reused
	//Two parameters                array     key
	public static int search(int [] array, int key) {
	
		int ind = -1;
		
		for(int i = 0; i<array.length; i++) {
			if (key == array[i]) {
				ind = i;
				break;
			}	
		}
		
		return ind;
	}

	public static void main(String[] args) {
		
		int [] array = {3, 8, 4, 2 ,12,16};
		int key = 16;
		int ind = search(array,key);
		System.out.println("Index : " + ind);
	}

}
