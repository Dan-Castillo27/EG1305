package assignment7;

public class Fan 
{ //begin class Fan

	private int speed;
	private boolean fanStatus = false;
	private double radius = 5;
	private String color = "blue";
	
	public void fan(int speed1, boolean fanStatus1, double radius1, String color1)
	{ //begin fan
		speed = speed1;
		fanStatus = fanStatus1;
		radius = radius1;
		color = color1;
	} //end fan
	
	public String toString()
	{ //begin toString
		return "Fan speed: " + speed + "\n" + "Color: " + color + "\n" + "Radius: " + radius + "\n" + "Fan status: " + ((fanStatus == true) ? "True" : "False");
	} //end toString
	
	public Fan()
	{ //begin Fan constructor
	
	} //end Fan constructor
	
} //end class Fan