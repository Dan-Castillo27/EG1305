package assignment7;

import java.util.*;

public class Coin 
{ //begin class Coin
	private String sideUp;
	
	public void toss ()
	{ //begin toss
		Random random = new Random();
		int randNum = 0;
		
		randNum = random.nextInt(2); // 0 to 1
		if( randNum == 1)
			sideUp = "heads";
		else
			sideUp = "tails";
	} //end toss
	
	public String getSideUp()
	{ //begin getSideUp
		return sideUp;
	} //end getSideUp
	
	public void Coin()
	{ //begin Coin
		toss();
	} //end Coin

} //end class Coin