package oopsatm.menu;

import javax.naming.InsufficientResourcesException;

import oopsatm.exceptions.InsufficientFundsException;

public interface BankingIface2 {
	public interface BankingIface{
	public abstract double withdraw(double amount, int actno) throws InsufficientFundsException;
	
	public abstract double deposite(double amount, int actno);//throws 
	public abstract double balanceEnquiry(int actno);
	public abstract double exit();
	}

	
}
