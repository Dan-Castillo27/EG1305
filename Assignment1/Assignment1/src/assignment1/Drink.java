package assignment1;

public class Drink 
{ // begin class drink

	public static void main(String[] args) 
	{ // begin main
		int customers = 12467;
		double perWeek = (.14*customers);
		double citrusPeople = (.64*customers); /*this is not correct as 64 percent of energy drink users prefer citrus not 
		64 percent of the customers, should be .14 * .64 * customers. Also include spaces on both sides of operators*/
		
		System.out.println("14% of customers, or approximately "+(int)perWeek+" people, buy one or more energy drinks per week.");
		System.out.println("With 64% of the customers, or approximately "+(int)citrusPeople+" people, prefer the citrus flavored drink");
	} // end main

} // end class drink
