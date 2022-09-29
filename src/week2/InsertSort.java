package week2;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] a = {8, 4, 5, 9, 11, 2, 7};
		
		for (int j = 1; j < a.length; j++) {
		
		int temp = a[j];//value of the first element in the unsorted part of the array e.g. 4
		int possibleIndex = j; //index of the first element in the unsorted part of the array e.g. 1
		
		while (possibleIndex>0 && temp < a[possibleIndex-1]) { //while 1>0 and 4 < 8
			a[possibleIndex] = a[possibleIndex-1]; // 4 = 8
			possibleIndex--; //reduce the index 1-1 = 0
		}
		a[possibleIndex] = temp;
	}
		System.out.println(Arrays.toString(a));
		
	}
}
//5
//2
//while 2>0 and 5<8
//5 = 8
//1

