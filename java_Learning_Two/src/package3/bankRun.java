package package3;

public class bankRun {

	public static void main(String[] args) {
	
		// local variable
		int z = 45; 
		
		bankAccount ba = new bankAccount("this is test");
		
		bankAccount ca = new bankAccount("dsfds");
		
		ba.setupAccount();
		
		ba.accountName="djlkjd";
		
		System.out.println(ca.accountName);
		
		

	}

}
