package assignment5;

import java.text.DecimalFormat;

public class FindPI 
{ //begin class FindPI
	
	public static void main(String[] args) 
	{ //begin main
		DecimalFormat formatter = new DecimalFormat("#.###");
		int iterations = 2500000;
		double PI = 0;
		long startTime = System.nanoTime();
		
		for (int i=1; i <= iterations; i++ ) 
		{ //begin for(i)
			PI += (Math.pow(-1, i+1 ) / (2*i - 1) * 4);	
		} //end for(i)
		
		long finishTime = System.nanoTime();
		long timeDiff = finishTime - startTime;
		
		double seconds = (double)timeDiff / 1000000000;
		
		System.out.println("PI = "+PI+" after "+iterations+" iterations");
		System.out.println("It took "+formatter.format(seconds)+" seconds to complete this operation");
		

	} //end main

} //end class FindPI
