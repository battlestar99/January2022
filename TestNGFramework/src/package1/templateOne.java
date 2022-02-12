package package1;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class templateOne {
	
	
	
	
	// test steps 
		@Test
		
		public void mainTest() {
			
			System.out.println("This is main test");	
			
		}
		
	
	// post requirment
		@AfterTest
		public void endTest() {
			
			System.out.println("This is after test");	
			
		}
		
	
	// pre-requirment
	@BeforeTest
	public void testSetup() {
		
	System.out.println("This is before test");	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
