package bankAccount;

public class runBank {

	public static void main(String[] args) {
		
		int x = 45; 
		
		bankAccount jim = new bankAccount(); 
		
		jim.deposit();
		
		bankAccount mike = new bankAccount();
		
		mike.transferMoney(123);

	}

}
