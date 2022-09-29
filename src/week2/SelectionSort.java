package week2;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {8, 4, 5, 9, 11, 2, 7};
		
		for (int i = 0; i < a.length-1; i++) {
			
			int smallindex = i;
			
			for (int k = i +1; k<a.length; k++) {
				
				if (a[k] < a[smallindex]) { //<ascending order, <descending order
					smallindex = k;
					
				}
				
			}
		int temp = a[i];
		a[i] = a[smallindex];
		a[smallindex] = temp;
		}
	System.out.println(Arrays.toString(a));//Arrays is a built-in Java Library that comes with several utility
										   // methods we can use with Arrays.
	}

}
