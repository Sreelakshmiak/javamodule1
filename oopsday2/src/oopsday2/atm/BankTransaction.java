package oopsday2.atm;

public class BankTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingIface bom=new BankofAmerica();
		
		double balance =bom.deposite(250);
		System.out.println("Balance after deposite =" +balance);
		balance =bom.withdraw(175.25);
		System.out.println("Balance after withdraw =" +balance);
	}

}
