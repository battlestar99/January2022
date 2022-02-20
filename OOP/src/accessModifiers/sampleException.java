package accessModifiers;

public class sampleException {

	public static void main(String[] args) {
		
		int a = 10; 
		int b = 0; 
		int c; 
		
		try {
		
		c = a / b; 
		
		}
		
		catch(ArithmeticException e){
		
			System.out.println(e.getMessage());
			
		}
		
		
		
		System.out.println("checking the exception");
		//System.out.println(c);
		

	}

}
