package bankAccount;

public class bankAccount {
	
	// properties/attributes, global variable
	// functions/ methods 
	
	
	public int amountMoney;
	public String accountName; 
	public String accountnumber; 
	public String email; 
	
	public bankAccount() {
		
	System.out.println("object is created");	
		
	}
	
	public bankAccount(int amountMoney) {
		
	this.amountMoney = amountMoney;
			
		}
	
	
	
	public static void calculateCustomerNumber() {
		
		System.out.println("customer number");
		
	}
	
	
	public void depositMoney() {
		
		int x; 
		System.out.println("Depositing money");
		
		
	}
	
	public void withdrawMoney() {
		
		System.out.println("withdraw money");
		
	}
	
   public void transferMoney() {
		
		System.out.println("transfer money");
		
	}
   
   
   public void transferMoney(int x) {
		
		System.out.println("transfer money with parameters");
		
		
		
	}
   
   public void transferMoney(String x) {
		
		System.out.println("transfer money with parameters string");
		
		
		
	}
   
  
	
	
	
	
	
	
	
	
	

}
