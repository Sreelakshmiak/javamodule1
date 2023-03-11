package oopsday2.atm;

public class BankTransaction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account(101,"naaja","savings",300000);
		Account a2=new Account(102,"sree","savings",100000);
		Account a3=new Account(103,"ami","savings",600000);
		Account a4=new Account(104,"joshua","savings",700000);
		Account a5=new Account(105,"megha","savings",600000);
		
		BankofAmerica2 boa=new BankofAmerica2();
				boa.addAccount(a1);
				boa.addAccount(a2);
				boa.addAccount(a3);
				boa.addAccount(a4);
				boa.addAccount(a5);
				System.out.println(boa.balanceEnquiry(103));
				System.out.println(boa.balanceEnquiry(104));
				double result=boa.deposite(100, 103);
				System.out.println(result);
				result=boa.withdraw(50, 103);
				System.out.println(result);
	}

}
