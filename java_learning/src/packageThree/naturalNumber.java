package packageThree;

import java.util.Scanner;

public class naturalNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value....");
		
		int x = sc.nextInt();
		
		int sum=0; 
		
		for(int i=1; i<=x; i++) {
			
			sum = sum+i; 
			
			System.out.println(i);
			
		}
		
		System.out.println("the value of the summation");
		System.out.println(sum);
		
		
		
		
		

	}

}
