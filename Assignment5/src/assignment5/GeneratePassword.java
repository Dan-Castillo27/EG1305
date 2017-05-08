package assignment5;

import java.util.*;

public class GeneratePassword 
{ //begin class GeneratePassword

	public static void main(String[] args) 
	{ //begin main
		int userInput = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many digits would you like to use for a numeric password?\n");
		userInput = input.nextInt();
		
		System.out.println("Your password is");
		
		for(int i=0; i < userInput; i++)
		{ //begin for(i)
			System.out.printf(Integer.toString(randomGenerator()) + " ");	
		} //end for(i)
	
	} //end main
	
	public static int randomGenerator() 
	{ //begin randomGenerator
		Random rand = new Random();
		
		int rng = 0;
		
		rng = rand.nextInt(9);
		
		return rng;
				
	} //end randomGenerator

} //end class GeneratePassword
