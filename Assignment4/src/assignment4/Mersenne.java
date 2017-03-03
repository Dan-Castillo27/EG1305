package assignment4;

//packages to import
import java.util.Scanner;

public class Mersenne 
{ //begin class Mersene

  public static void main(String[] args) 
  { //begin main

		Scanner input = new Scanner(System.in);
	
		int i = 2;
		double mersenne = 0.0;
		int mersenneCount = 0;
		int userInput;

		System.out.println("Enter a number. The program will print all the Mersenne prime numbers than this number");
		userInput = input.nextInt();
		
		while(mersenne < userInput) 
		{ //begin while(mersene < userInput)	
			if(prime(i))
			{ //if(prime(i))
				mersenne = (Math.pow(2, i)) - 1;
				
				if(mersenne < userInput) 
				{ //begin if(mersene < userInput)
					
					if(prime((int)mersenne))
					{ //begin if(prime((int)mersene))
						System.out.print((int)mersenne + "\t");
						mersenneCount++;
					} //end if(prime((int)mersene))
					
				} //end if(mersene < userInput)
				
			} //end if(prime(i))
			i++;
		} //end while(mersene < userInput)
		
		System.out.println("\nThere are a total of " + mersenneCount + " mersenne prime numbers" );
		

	} //end main
	
	
	
	public static boolean prime(int x) 
	{ //begin prime
		
		int y, divisor, prime = 1;
		
		divisor = x / 2;
		
		for(y = 2; y <= divisor; y++) 
		{ //begin for(x = 2; x <= divisor; x++)
			if(x % y == 0) 
			{ //end if(x % y == 0)
				prime = 0;
				break;
			} //end if(x % y == 0)
		} //end for(y = 2; y <= divisor; y++)
	
		if(prime == 0) 
			return true;
		else
			return false;
		
		
	} //end prime

} //end class Mersene
