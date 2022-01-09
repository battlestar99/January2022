package packageTwo;

import java.util.Scanner;

public class carPaymentV2 {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		double basePrice; 
		double downpayment; 
		double adminfee; 
		double tax; 
		double apr; 
		int months; 
		
		System.out.println("Enter the price of the car..");
		basePrice = input.nextDouble(); 
		
		System.out.println("Enter the downpayment amount..");
		downpayment = input.nextDouble(); 
		
		adminfee = 300;
		tax = 3; 
		apr = 2; 
		
		System.out.println("Enter the number of months for financing.");
		months = input.nextInt(); 
		
		double totalprice; 
		double totalPricewithTax; 
		double taxValue; 
		double financeAmount; 
		double interestAmount; 
		double monthlyPayment; 
		
		// calculating the total price
		totalprice = basePrice + adminfee;
		
		System.out.println("Total price of the car ...");
		System.out.println(totalprice);
		
		taxValue = (totalprice*(tax/100));
		
		totalPricewithTax = totalprice + taxValue;
		
		System.out.println("Total price of the car with tax ...");
		System.out.println(totalPricewithTax);
		
		
		financeAmount = totalPricewithTax - downpayment; 
		
		System.out.println("Financing amount of the car ...");
		System.out.println(financeAmount);
		
		interestAmount = financeAmount*(apr/100);
		
		System.out.println("Interest amount of the car ...");
		System.out.println(interestAmount);
		
		financeAmount = financeAmount + interestAmount; 
		
		monthlyPayment = financeAmount/months;
		
		System.out.println("Monthly payment amount of the car ...");
		System.out.println(monthlyPayment);
		
		
		
		
	
		

	}

}
