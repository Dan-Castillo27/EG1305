package assignmnet3;

//packages to import
import java.util.Scanner;

public class DaysInMonth 
{ //begin class DaysInMonth

	public static void main(String[] args) 
	{ //begin main
		
		int year, month; 
		int daysInMonth = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a year: ");
		year = input.nextInt();
		
		System.out.println("With 1 being January and 12 being December; please enter a month: ");
		month = input.nextInt();
				
		switch (month) //this determines how many days there are in a month in a given year
		{ //begin switch(month)
			case 1: 
				daysInMonth = 31;
				break;
			case 2: 
				if (year % 4 == 0 || year % 400 == 0) //this checks for a leap year
				{ //begin if(year % 4 == 0 || year % 400 == 0)
					daysInMonth = 29;
				} //end if(year % 4 == 0 || year % 400 == 0)
				else //this condition is met when there isn't a leap year
				{ //begin else
					daysInMonth = 28;
				} //end else
				break;
			case 3: 
				daysInMonth = 31;
				break;
			case 4:
				daysInMonth = 30;
				break;
			case 5:
				daysInMonth = 31;
				break;
			case 6:
				daysInMonth = 30;
				break;
			case 7:
				daysInMonth = 31;
				break;
			case 8: 
				daysInMonth = 31;
				break;
			case 9:
				daysInMonth = 30;
				break;
			case 10:
				daysInMonth = 31;
				break;
			case 11: 
				daysInMonth = 30;
				break;
			case 12: 
				daysInMonth = 31;
				break;
		} //end switch(month)
		
		System.out.println("There are "+daysInMonth+" days in "+month+"/"+year+".");
		
	} //end main

} //end class DaysInMonth
