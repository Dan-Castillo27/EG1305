package assignment2;

//packages to import
import java.util.Scanner;

public class SumDigits 
{ //begin class SumDigits

	public static void main(String[] args) 
	{ // begin main
	
        int num1;
        int sumOfDigits = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer less than 1000 to add its digits: ");
        num1 = input.nextInt();
        
        while(num1 >= 1000 || num1 < 0)
        { //begin while(num1 >= 1000 || num1 < 0)
            System.out.print("Enter a positive integer less than 1000 to add its digits: ");
            num1 = input.nextInt();
        } // end while(num1 >= 1000 || num1 < 0)	
        
		while(num1 > 0) 
		{ // begin while(num > 0)
			sumOfDigits += num1 % 10;
			num1 /= 10;
		} // end while(num > 0)
		
		System.out.println("The sum is: "+sumOfDigits);
		
	} // end main
	
} //end class SumDigits