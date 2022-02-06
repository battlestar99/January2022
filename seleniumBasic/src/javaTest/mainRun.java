package javaTest;

public class mainRun {

	public static void main(String[] args) {
		
		car honda = new car("red");
		
		car toyota = new car("white");
		
		car ford=new car("blue");
		
		
		System.out.println(honda.color);
		System.out.println(ford.color);
		
		honda.color="red";
		
		toyota.color="black";
		
		//System.out.println(honda.mileage);
		
		//System.out.println(toyota.color);
		

	}

}
