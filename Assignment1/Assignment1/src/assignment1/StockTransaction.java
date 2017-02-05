package assignment1;
// packages to import
import java.text.DecimalFormat;


public class StockTransaction 
{ // begin class stocktransaction

	public static void main(String[] args) 
	{ // begin main
		DecimalFormat formatter = new DecimalFormat("#0.00");
		final double COMMISSION_RATE = 0.02; //a fixed rate, will never change
		double buyPerShare = 32.87;
		double sellPerShare = 33.92;
		int numShares = 1000;
		double firstCom = (COMMISSION_RATE)*(numShares*buyPerShare);
		double secCom = (COMMISSION_RATE)*(numShares*sellPerShare);
		double profit = ((numShares*sellPerShare)-secCom) - ((numShares*buyPerShare)-firstCom);
		/* This formula is not correct. First calculate the profit: sold - bought, then take off the commission to find the net profit.
		 should be double profit = ((numShares*sellPerShare - numShares*buyPerShare)) - (secCom+firstCom);
		 */
		
		System.out.print("Joe paid $"+(numShares * buyPerShare)+" for 1000 shares of stock, $"+buyPerShare+" per share. He paid his stockbroker a 2% commission,");
		System.out.println(" totalling to $"+formatter.format(firstCom));
		System.out.print("Joe then sold his shares at $"+sellPerShare+" earning $"+(numShares*sellPerShare)+". He then paid his stockbroker ");
		System.out.print("another 2% commission, this time at $"+formatter.format(secCom)+", Joe profitted $"+formatter.format(profit));
	} // end main

} // end class stocktransaction
