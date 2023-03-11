package oopsday2.atm;

public class BankofAmerica implements BankingIface {
	
	private Account account= new Account(10010,"sree","salary",500);
	

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		account.setBalance(account.getBalance()-amount );
		return account.getBalance();
	}

	@Override
	public double deposite(double amount) {
		// TODO Auto-generated method stub
		account.setBalance(account.getBalance()+amount );
		return account.getBalance();
		//return 0;
	}

	@Override
	public double balanceEnquiry(int actno) {
		// TODO Auto-generated method stub
		return account.getBalance();
		
		//return 0;
	}

}
