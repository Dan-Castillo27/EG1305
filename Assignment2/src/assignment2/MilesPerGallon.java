package assignment2;

//packages to import
import java.util.Scanner;

public class MilesPerGallon 
{ //begin class MilesPerGallon

	public static void main(String[] args) 
	{ //begin main
	
		Scanner input = new Scanner(System.in);
		int gallonsUsed = 0;
		int milesDriven = 0;
		
		System.out.println("Enter the miles driven: ");
		milesDriven = input.nextInt();
		System.out.println("Enter the amount of gallons used: ");
		gallonsUsed = input.nextInt();
		
		double mpg = (double) milesDriven / gallonsUsed;
		
		System.out.println("The miles per gallon of your vehicle is: "+mpg);
		
	} // end main

} //end class MilesPerGallon
