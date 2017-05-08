package assignment6;

import java.util.*;
import java.text.*;


public class TestCircle 
{ //begin class TestCircle
	
	public static void main(String[] args)
	{ //begin main
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#.####");
		Circle circle = new Circle();
		
		System.out.println("Please enter the radius of the circle:");
		double radius = input.nextDouble();
		circle.Circle(radius);
		
		System.out.println("The circle's radius is: "+formatter.format(circle.getRadius()));
		System.out.println("The circle's diameter is: "+formatter.format(circle.getDiameter()));
		System.out.println("The circle's area is : "  +formatter.format(circle.getArea()));
		System.out.println("The circle's circumference is: "+formatter.format(circle.getCircumference()));
		
	} //end main
	
} //end class TestCircle