package assignment6;

public class Pet 
{ //begin class Pet

	private String name;
	private String type;
	private int age;
	
	public String getName()
	{ //begin getName
		return name;
	} //end getName
	
	public String getType()
	{ //begin getType
		return type;
	} //end getType
	
	public int getAge()
	{ //begin getAge
		return age;
	} //end getAge
	
	public void Pet(String name1, String type1, int age1)
	{ //begin Pet
		name = name1;
		type = type1;
		age = age1;
	} //end Pet
	
	public Pet()
	{ //begin pet constructor
		
	} //end pet constructor
	
} //end class Pet