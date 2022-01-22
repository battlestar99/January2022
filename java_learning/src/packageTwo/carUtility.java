package packageTwo;

public class carUtility {
	
	
	
	public double getTaxAmount(double totalPrice, double tax) {
		
		double taxValue; 
		taxValue = (totalPrice*(tax/100));
		
		return taxValue; 
		
	}
	
	public double calculateApr(int creditScore) {
		
   double apr = 0; 
   
		if(creditScore>=750) {
			
			apr = 1.5; 
			
		}
		else if(creditScore<750 && creditScore>=680 ) {
			
			apr = 2.5; 
			
		}
		
		else if(creditScore<680 && creditScore>=600 ) {
			
			apr = 4; 
			
		}
		
	
		return apr; 
		
		
	}
	
	
	public double calculateMonthlyPayment(double financeAmount, int months) {
		
		double monthlyPayment = financeAmount/months;
		
		return monthlyPayment;
		
	}
	
	
	
	
	
	

}
