package assignment1;

// packages to import
import java.text.DecimalFormat;

public class Circle 
{ // begin class circle

	public static void main(String[] args) 
	{ // begin main
		DecimalFormat formatter = new DecimalFormat("#0.0000"); // new object named formatter
		double radius = 5.0;
		double diameter = 2*radius;
		double perimeter = 2 * Math.PI * radius; // I'm using the Math class to pull the value of pi
		double area = Math.PI * (radius * radius);
		
		System.out.println("The radius of the circle is "+radius+" and the diameter is "+diameter);
		System.out.println("The perimeter is "+formatter.format(perimeter)+" and the area is "+formatter.format(area));
	} // end main

} // end class circle
