package assignment7;

import java.util.*;

public class TestFan 
{ //begin class TestFan

	public static void main(String[] args)
	{ //begin main
		Scanner input = new Scanner(System.in);
		Fan fan = new Fan();
		
		int speed1 = 0;
		boolean fanStatus1 = false;
		double radius1 = 0;
		String color1 = "";
		
		System.out.println("Enter fan speed: ");
		speed1 = input.nextInt();
		System.out.println("Enter fan radius: ");
		radius1 = input.nextDouble();
		System.out.println("Enter fan Fan Status: ");
		fanStatus1 = input.nextBoolean();
		System.out.println("Enter fan color: ");
		color1 = input.next();
		
		fan.fan(speed1, fanStatus1, radius1, color1);
		
		System.out.println("\n"+fan.toString());
		
	} //end main
	
} //end class TestFan