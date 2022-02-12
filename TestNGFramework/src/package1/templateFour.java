package package1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class templateFour {
	
	@BeforeTest
	public void setupTest() {
		System.out.println("this is beforetest");
		
	}
	
	@BeforeMethod
	
	public void setupeachTest() {
		
		System.out.println("this is beforemthod");
		
	}
	
	
	@AfterMethod
	
	public void endeachTest() {
		
		System.out.println("this is afterMethod");
		
	}
	
	
	@Test(priority=0)
	public void validateLoginElements() {
		
		System.out.println("this is priority 0 test");
		
	}
	
	@Test(priority=1)
	public void validatePositiveLogin() {
		
		System.out.println("this is priority 1 test");
		
	}
	
	@AfterTest
	public void endTest() {
		
		System.out.println("this is aftertest");
		
	}
	
	

}
