package oopsatm.menu;
import oopsatm.exceptions.InsufficientFundsException;


public class BankofAmerica2 implements BankingIface2 {
	private Account []accounts =new Account[5];
	
	private int accountIndex=0;
	
	
public BankofAmerica2() {
	
		
	}
	
	

public BankofAmerica2(Account[] accounts) {
	//super();
	this.accounts = accounts;
}



public void addAccount(Account account)
{
	if(this.accountIndex < accounts.length)
	{
		accounts [this.accountIndex++]=account;
	}
	else 
		System.out.println("operation not allowed");
}
public Account trasactionAccount(Account account)
{
	return account;
}


public double withdraw(double amount,int actno) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		double tempBal=0;
		
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getActno() ==actno)
			{
				if(accounts[i].getBalance()< amount)
				{
				throw new InsufficientFundsException("insufficient funts");	
				}
				tempBal = accounts[i].getBalance();
				tempBal -=amount;
				accounts[i].setBalance(tempBal);
				break;
				
			}
		}
		return tempBal;
	}

public double deposite(double amount, int actno) {
		double tempBal=0;
		// TODO Auto-generated method stub
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getActno() ==actno)
			{
				tempBal = accounts[i].getBalance();
				tempBal +=amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;
	}
public double balanceEnquiry(int actno) {
		// TODO Auto-generated method stub
		
		
		double tempBal=0;
		// TODO Auto-generated method stub
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getActno() ==actno)
			{
				tempBal = accounts[i].getBalance();
			break;
			}
		}
		return tempBal;
		//return 0;
}
		
		public void displayAccount(int actno)
		{
			for(int i=0;i<accounts.length;i++)
			{
				if(accounts[i].getActno()==actno)
				{
					System.out.println(accounts[i].getActno());
					System.out.println(accounts[i].getName());
					System.out.println(accounts[i].getActType());
					System.out.println(accounts[i].getBalance());
				}
				
					
				}
			
	

}

public Account[] getAccounts() {
	return accounts;
}


public void setAccounts(Account[] accounts) {
	this.accounts = accounts;
}


			
		}

