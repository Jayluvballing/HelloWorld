package week2;

public class Continuekeyword {

	public static void main(String[] args) {
		
		//CONTINUE EXAMPLE WHILE LOOP	
		int i = 0; 
		while (i<10) {
			i++;
			if (i==5)  {
			    continue; //SKIPS THE SPECIFIC ITERATION AND CONTINUES
			}
		System.out.println(i);
	}
	
	//CONTINUE EXAMPLE USING C FOR LOOP	
		int j =0;
		for(j=0; j<10; j++) {
			if (j==7) {
				continue;
			}
			
			System.out.println(j);

			}

}
}