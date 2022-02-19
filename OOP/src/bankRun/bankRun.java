package bankRun;

import bankAccount.bankAccount;

public class bankRun {

	public static void main(String[] args) {
		
		
		bankAccount.calculateCustomerNumber();
		
		bankAccount mike = new bankAccount();
		
		bankAccount john = new bankAccount();
		
		bankAccount jim = new bankAccount(2000);
		
		mike.accountName="Mike123";
		john.amountMoney=1000;
		
		System.out.println(mike.accountName);
		
		System.out.println(john.accountName);
		
		System.out.println(mike.amountMoney);
		
		System.out.println(jim.amountMoney);
		
		jim.transferMoney("test");
		
		

	}

}
