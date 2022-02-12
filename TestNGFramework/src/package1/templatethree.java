package package1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class templatethree {
	
	
	@BeforeTest
	public void setupTest() {
		
		
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
		
		
		
	}

}
