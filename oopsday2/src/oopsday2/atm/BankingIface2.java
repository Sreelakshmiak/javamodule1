package oopsday2.atm;

public interface BankingIface2 {

	public abstract double withdraw(double amount, int actno);
	public abstract double deposite(double amount, int actno);
	public abstract double balanceEnquiry(int actno);
	
}
