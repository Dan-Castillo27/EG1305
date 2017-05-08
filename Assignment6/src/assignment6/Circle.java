package assignment6;

public class Circle
{ //begin class Circle
	
	private double radius;
	
	public double getRadius()
	{ //begin getRadius
		return radius;
	} //end getRadius
	
	public double getArea()
	{ ///begin getArea
		return Math.PI * Math.pow(radius, 2);
	} //end getArea
	
	public double getDiameter()
	{ //begin getDiameter
		return 2 * radius;
	} //end getDiameter
	
	public double getCircumference()
	{ //begin getCircumference
		return 2 * Math.PI * radius;
	} //end getCircumference
	
	public void Circle(double r)
	{ //begin Circle
		radius = r;
	} //end Circle
	
	public Circle()
	{ //begin Circle constructor
		
	} //end Circle constructor

} //end class Circle