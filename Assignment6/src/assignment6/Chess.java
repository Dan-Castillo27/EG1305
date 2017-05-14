package assignment6;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Chess 
{ //begin class Chess

	public static void main(String[] args) 
	{ //begin main
		BigInteger totalGrains = new BigInteger("0");
		long finalGrains = 0;
		int chessBoard = 64;
	
		for(int i = 0; i <=chessBoard; i++) 
		{ // for(i)
			double calc1 = (Math.pow(2, i));
			
			System.out.println("calc1: " + calc1);
			
			String grain = removeChar(Double.toString(calc1));
			
			System.out.println("Ex: " + grain);
			
			BigInteger temp1 = new BigInteger(grain);
					
			totalGrains = totalGrains.add(temp1);
		} //end for(i)
		
		finalGrains = (long)Math.pow(2, chessBoard);
		System.out.println("Total grains: " + totalGrains + "\n" + "Final grains: " + finalGrains);
	} //end main
	
	private static String removeChar(String str)
	{ //begin removeChar
		return str.substring(0, str.length()-2);
	} //end removeChar
	
} //end class Chess
