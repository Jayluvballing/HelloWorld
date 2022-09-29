package week2;

public class GOODCODE {

	public static void main(String[] args) {
		String[] carMakes = {"Volvo", "BMW", "Ford", "Mazda"};
		/*
		 * USING C FOR LOOP (USED WHEN PLAYING WITH INDICES)
		 * for(int carMakeIndex = 0; carMakeIndex < carMakes.length; carMakeIndex++)
			System.out.println(carMakes[carMakeindex]);
		 */
		
		//USING FOR EACH LOOP (IF THE DATA STRUCTURE IS AN ARRAY)
		for(String carMake: carMakes) {
			System.out.println(carMake);
			
			/*If you want to play with indices
            Use C For Loop
        	else If the data structure is an array
            Use For Each
        	else If the data structure is an object
            Use For In
            */
			
			//BIG O NOTATION - DEFINES SCALABILITY 
			//Big O Notation: is used to calculate the time that is required to run a code
			
		
			//Hash table(objects/ hash maps) helps to decrease the complexity of a code 
	}

}
}