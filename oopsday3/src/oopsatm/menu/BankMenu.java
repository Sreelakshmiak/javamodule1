package oopsatm.menu;

//import oopsday2.atm.Account;
import java.util.Scanner;

import oopsatm.exceptions.InsufficientFundsException;
//import oopsday2.atm.BankofAmerica2;

public class BankMenu {
	
	
	
	BankofAmerica2 boa=new BankofAmerica2();
	public BankMenu() {
		Account a1=new Account(101,"naaja","savings",300000);
		Account a2=new Account(102,"sree","savings",100000);
		Account a3=new Account(103,"ami","savings",600000);
		Account a4=new Account(104,"joshua","savings",700000);
		Account a5=new Account(105,"megha","savings",600000);
		
		//BankofAmerica2 boa=new BankofAmerica2();
				boa.addAccount(a1);
				boa.addAccount(a2);
				boa.addAccount(a3);
				boa.addAccount(a4);
				boa.addAccount(a5);
	}		
				
	public void menu() throws InsufficientFundsException {			
		Scanner scanner =new Scanner (System.in);
		int choice =0;
		loop: do {
			System.out.println("enter the choice");
			choice=scanner.nextInt();
			switch (choice){
			case 1:
			{
				System.out.println(" enter account ");
				int actno=scanner.nextInt();
				boa.displayAccount(actno);
				break;
				
			}
			case 2: 
			{
				System.out.println("enter account no: ");
				int actno=scanner.nextInt();
				System.out.println("enter deposit amount: ");
				int val=scanner.nextInt();
				System.out.println("Balance: "+ boa.deposite(val, actno));
				break;
			}
			case 3:
			{	
				System.out.println("enter account no: ");
				int actno=scanner.nextInt();
				System.out.println("enter deposit amount: ");
				int val=scanner.nextInt();
				double balance=0;
				try {
					balance =boa.withdraw(val, actno);
				}catch(InsufficientFundsException e)
				{
					e.printStackTrace();
				}
				System.out.println("Balance: "+ boa.withdraw(val, actno));
				break;
				
			}
			case 4:
			{
				System.out.println("enter account no: ");
				int actno=scanner.nextInt();
				System.out.println("Balance: "+boa.balanceEnquiry(actno));
				//break;
				break;
				
			}
			case 5:{System.out.println("exiting..");
			//System.exit(0);break;
			}
			
			}
			
			
		
		
		}while(choice!=5);
	}
}
		