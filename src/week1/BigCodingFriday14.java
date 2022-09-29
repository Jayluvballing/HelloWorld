package week1;

import java.util.Scanner;

public class BigCodingFriday14 {

	public static void main(String[] args) {
        Scanner timeandmeters  = new Scanner (System.in);
		
		System.out.println("Input distance in meters, input hour, input minutes, input seconds: ");
		
		float meters = timeandmeters.nextInt();
		float hour = timeandmeters.nextInt();
		float minutes = timeandmeters.nextInt();
		float seconds = timeandmeters.nextInt();
		
		System.out.println("Your speed in meters/second is " + (float)meters/ ((hour*3600) + (minutes*60) +seconds));
		System.out.println("Your speed in km/h is " + (float)((meters/1000) / (float)((hour+(minutes/60)+(seconds/3600)))));
		System.out.println("Your speed in miles/h is " + (float)(meters/1609)/(float)((hour+(minutes/60)+(seconds/3600))));

	}

}
