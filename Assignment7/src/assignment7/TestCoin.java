package assignment7;

public class TestCoin 
{ //begin class TestCoin
	
	public static void main(String[] args)
	{ //begin main
		
		Coin quarter = new Coin();
		int tailsCount = 0;
		int headsCount = 0;
		int numToss = 20;
		
		quarter.toss();
		System.out.println( "Side initially facing up: " +quarter.getSideUp());
		
		for( int coinToss =1; coinToss <= numToss; coinToss++)
		{ //begin for(cointoss)
			quarter.toss();
			
			System.out.println( "Toss "+coinToss+": "+quarter.getSideUp());
			
			if(quarter.getSideUp() == "heads")
				headsCount++;
			else if(quarter.getSideUp() == "tails")
				tailsCount++;
		} //end for(cointoss)
		
		System.out.println("Out of "+numToss+" tosses, there were "+headsCount+" heads and "+tailsCount+" tails");
		
	} //end main
	
} //end class TestCoin