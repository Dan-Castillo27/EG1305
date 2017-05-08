package assignment7;

import java.util.*;

public class Account 
{ //begin class Account

	private int id;
	private double balance;
	private double annualInterestRate;
	private String dateCreated;
	
	public Account(int id1, double balance1, double annualInterestRate1)
	{ //begin Account
		id1 = id;
		balance1 = balance;
		annualInterestRate1 = annualInterestRate;
	} //end Account
	
	public void setId(int id1)
	{ //begin setId
		id = id1;
	} //end setId
	
	public int getId()
	{ //begin getId
		return id;
	} //end getId
	
	public void setBalance(double balance1)
	{ //begin setBalance
		balance = balance1;
	} //end setBalance
	
	public double getBalance()
	{ //begin getBalance
		return balance;
	} //end getBalance
	
	public void setAnnualInterestRate(double annualInterestRate1)
	{ //begin setAnnualInterestRate
		annualInterestRate = annualInterestRate1;
	} //end setAnnualInterestRate
	
	public double getAnnualInterestRate()
	{ //begin getAnnualInterestRate
		return annualInterestRate;
	} //end getAnnualInterestRate
	
	public String dateCreated()
	{ //begin dateCreated
		Date today = new Date();
		dateCreated = "" + today;
		return dateCreated;
	} //end dateCreated
	
	public double getMonthlyInterestRate()
	{ //begin getMonthlyInterestRate
		return annualInterestRate / 12;
	} //end getMonthlyInterestRate
	
	public void withdraw(double cash)
	{ //begin withdraw
		balance -= cash;
	} //end withdraw
	
	public void deposit(double cash)
	{ //begin deposit
		balance += cash;
	} //end deposit
	                                                                                                                                                                                                                                                                                                                                                                                                     
	public Account()
	{ //begin Account constructor
		
	} //end Account constructor
	
} //end class Account