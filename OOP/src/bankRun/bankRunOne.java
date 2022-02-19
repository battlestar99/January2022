package bankRun;

import bankAccount.bankAccount;
import bankAccount.checkingAccount;
import bankAccount.savingAccount;

public class bankRunOne {

	public static void main(String[] args) {
		
		checkingAccount michael = new checkingAccount();
		
		michael.withdrawMoney();
		
		bankAccount jim = new bankAccount();
		
		savingAccount sa = new savingAccount();
		
		sa.transferMoney();
		
		michael.depositMoney();
		
		
		
		

	}

}
