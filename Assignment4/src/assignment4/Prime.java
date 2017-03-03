package assignment4;

//packages to import
import java.util.Scanner;

public class Prime 
{ //begin class Prime

	public static void main(String[] args) 
	{ //begin main

		Scanner input = new Scanner(System.in);
	
		int x, y;
		int prime = 0, divisor = 0, primeCount = 1;
		int userInput = 0;
		

		System.out.println("Enter a number. The program will print all the prime numbers than this number");
		userInput = input.nextInt();
		

		for(x = 2; x < userInput; x++) 
		{ //begin for(x = 2; x < userInput; x++)
			divisor = x / 2;
			
			for(y = 2; y <= divisor; y++) 
			{ //begin for(y = 2; y <= divisor; y++)
				if(x % y == 0) 
				{ //begin if(x % y == 0)
					prime = 0;
					break;
				} //end if(x % y == 0)
			} //end for(y = 2; y <= divisor; y++)
			
			if(prime == 1) 
			{ //begin if(prime == 1)
				System.out.printf(x + "\t");
				primeCount++;
			} //end if(prime == 1)
			
			prime = 1;
		} //end for(x =  2; x < userInput; x++)
	
		System.out.println("\n\nThere are a total of "+ primeCount +" prime numbers");
		
	} //end main
	
} //end class Prime