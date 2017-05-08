package assignment6;

import java.util.*;
import java.lang.*;

public class Distance 
{ //begin class Distance

	public static void main(String[] args) 
	{ //begin main
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter x1: ");
		int x1 = input.nextInt();
		System.out.println("Enter y1: ");
		int y1 = input.nextInt();
		
		System.out.println("Enter x2: ");
		int x2 = input.nextInt();
		System.out.println("Enter y2: ");
		int y2 = input.nextInt();
		
		System.out.println("Disance is: "+getDistance(x1, y1, x2, y2));
		
	} //end main
		
	public static double getDistance(int x1, int y1, int x2, int y2)
	{ //begin getDistance	
		return Math.sqrt(Math.pow( (x2 - x1), 2) + Math.pow( (y2 - y1), 2)) ;
	} //end getDistance

} //end class Distance