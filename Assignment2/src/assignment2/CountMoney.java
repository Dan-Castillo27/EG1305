package assignment2;

//packages to import
import java.util.Scanner;

public class CountMoney 
{ //begin class CountMoney

	public static void main(String[] args) 
	{ //begin main
	
		int money, dollars, cents, quarters, dimes, nickels, pennies;		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of money spent, the last two numbers will be counted as the cents ");
		System.out.println("for example, 1156 for 11.56: ");
		money = input.nextInt();
		
		dollars = money/100;
		cents = money % 100;
		quarters = cents/25;
		if(cents % quarters == 0)
		{
			dimes = 0;
			nickels = 0;
			pennies = 0;
		}
		dimes = (cents/10) % 10;
		nickels = (cents % 5);
		pennies = (cents%100) / 100;
		
		System.out.println("The amount dollars is "+dollars+"\nThe amount of quarters is "+quarters);
		System.out.println("The amount of dimes is "+dimes+"\nThe amount of nickels is "+nickels);
		System.out.println("The amount of pennies is "+pennies);
	} //end main

} // end class CountMoney
