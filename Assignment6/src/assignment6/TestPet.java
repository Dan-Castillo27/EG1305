package assignment6;

import java.util.*;

public class TestPet 
{ //begin class TestPet

	public static void main(String[] args)
	{ //begin main
		Scanner input = new Scanner(System.in);
		Pet pet = new Pet();
		
		System.out.println("Please enter your pet's name");
		String name = input.nextLine();
		
		System.out.println("Please enter your pet's type");
		String type = input.nextLine();
		
		System.out.println("Please enter your pet's age");
		int age = input.nextInt();
		
		pet.Pet(name, type, age);
		
		System.out.println("Pet object created");
		System.out.println("Your pet's name is "+pet.getName());
		System.out.println("Your pet's type is "+pet.getType());
		System.out.println("Your pet's age is "+pet.getAge());
	} //end main
	
} //end class TestPet