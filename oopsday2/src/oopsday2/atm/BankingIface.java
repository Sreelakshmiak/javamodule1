package oopsday2.atm;

public interface BankingIface {

	public abstract double withdraw(double amount);
	public abstract double deposite(double amount);
	public abstract double balanceEnquiry(int actno);
	
}
