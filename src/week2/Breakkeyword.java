package week2;

public class Breakkeyword {

	public static void main(String[] args) {
	//EXAMPLE TO BREAK OUT OF OUTER LOOP
		outer:
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if (j==2) {
					break outer;//breaks from outer loop for each for loop
				}
					//break; //breaks for only inner loop
				
				System.out.println("i: " + i + ", j: " + j);
			}
		}
		
		//EXAMPLE TO BREAK OUT OF LOOP USING WHILE LOOP
		
		int i = 0; 

		while (i<10) {
			
			if (i==5) {
			    break; //breaks and gets out of the loop 
				}
		System.out.println(i);
			i++;	

	}
		
	
	}
}

