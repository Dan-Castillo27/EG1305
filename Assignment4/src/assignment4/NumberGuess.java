package assignment4;

//packages to import
import java.util.*;
import javax.swing.JOptionPane;

public class NumberGuess 
{ //begin class NumberGuess

	public static void main(String[] args) 
	{ //begin main
		
		Random rand = new Random();
		
		int randomInt = 0;
		int userInput = 0;
		
		randomInt = rand.nextInt(100) + 1;
		
		System.out.println("Enter a number between 1 and 100");
		
		while(userInput != randomInt) 
		{ //begin while(userInput != randomInt)
			
			userInput = Integer.parseInt(JOptionPane.showInputDialog("" + "\n"));
			System.out.println("" + userInput);
			
			if(userInput > randomInt)
				System.out.println("Guess lower");
			else if(userInput < randomInt)
				System.out.println("Guess higher");
	
		} //end while(userInput != randomInt)
		
		
		System.out.println("You guessed it right");
		

	} //end main

} //end class NumberGuess