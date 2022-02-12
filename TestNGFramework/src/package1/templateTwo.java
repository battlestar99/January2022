package package1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class templateTwo {
	
	
	
	
	@BeforeTest
	public void setupTest() {
		System.out.println("this is pre-requirment");
	}
	
	
	@Test
	public void btest() {
		
		System.out.println("this is btest");
		
	}
	@Test
	public void ctest() {
		System.out.println("this is ctest");
		
	}
	
	
	
	
	@AfterTest
	public void endTest() {
		System.out.println("this is post-requirment");
		
	}

}
