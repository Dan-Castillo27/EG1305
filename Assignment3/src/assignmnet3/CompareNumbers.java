package assignmnet3;

//packages to import
import java.util.Scanner;
import java.text.DecimalFormat;

public class CompareNumbers 
{ //begin class CompareNumbers

	
	public static void main(String[] args) 
	{ //begin main
		
		int num1, num2, num3, sum, product, max = 0, min = 0;
		double avg;
		
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println("Enter first integer: ");
		num1 = input.nextInt();
		
		System.out.println("Enter second integer: ");
		num2 = input.nextInt();
		
		System.out.println("Enter third integer: ");
		num3 = input.nextInt();
		
		if(num1 >= num2 && num1 >= num3)  //this block of if statements tests for the maximum number
		{ //begin if(num1 >= num2 && num1 >= num3)
			max = num1;
		} //end if(int1 >= int2 && int1 >= num3)
		
		else if(num2 >= num1 && num2 >= num3) 
		{ //begin else if(num2 >= num1 && num2 >= num3)
			max = num2;
		} //end else if(num2 >= num1 && num2 >= num3)
		
		else if(num3 >= num2 && num3 >= num1) 
		{ //begin else if(num3 >= num2 && num3 >= num1)
			max = num3;
		} //end else if(num3 >= num2 && num3 >= num1)
		
		if(num1 <= num2 && num1 <= num3)  //this block of if statments tests for the minimum number
		{ //begin if(num1 <= num2 && num1 <= num3)
			min = num1;
		} //end if(num1 <= num2 && num1 <= num3)
		else if(num2 <= num1 && num2 <= num3) 
		{ //begin else if(num2 <= num1 && num2 <= num3)
			min = num2;
		} //end else if(num2 <= num1 && num2 <= num3)
		else if(num3 <= num2 && num3 <= num1) 
		{ //begin else if(int3 <= int2 && int3 <= num1)
			min = num3;
		} //end else if(num3 <= num2 && num3 <= num1)
		
		sum = num1 + num2 + num3; //this finds the sum
		product = num1 * num2 * num3; //this finds the product
		avg = (double) sum / 3; // casting here is important because of the integer division going on with sum
		
		System.out.println("For the numbers "+num1+", "+num2+", and "+num3+".");
		System.out.println("The largest is: "+max);
		System.out.println("The smallest is: "+min);
		System.out.println("The sum is: "+sum);
		System.out.println("The product is: "+product);
		System.out.println("The average is: "+formatter.format(avg));
		
		
	} //end main

} //end class CompareNumbers.java
