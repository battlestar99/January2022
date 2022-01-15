package packageThree;

import java.util.Scanner;

public class compareNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number: ");
		int numberOne = sc.nextInt(); 
		
		System.out.println("Enter the Second Number: ");
		int numberTwo = sc.nextInt(); 
		
		System.out.println("Enter the Third Number: ");
		int numberThree= sc.nextInt(); 
		
		
		if(numberOne>numberTwo && numberOne>numberThree) {
			
			System.out.println("The largest Number ...");
			System.out.println(numberOne);
			
		}
		
		else if(numberTwo>numberOne && numberTwo>numberThree) {
			
			System.out.println("The largest Number ...");
			System.out.println(numberTwo);
			
		}
		
		else if(numberThree>numberOne && numberThree>numberTwo) {
			
			System.out.println("The largest Number ...");
			System.out.println(numberThree);
			
		}
		
		else {
			
			System.out.println("There is no largest number or  mulitple same number");
			
		}
		
		
		

	}

}
