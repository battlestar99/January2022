package package1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class templateFive {
	
	
	
	@BeforeTest
	public void setupTest() {
		
		System.out.println("this is beforetest");
		
	}
	
	@AfterTest
	public void endTest() {
		
		System.out.println("this is aftertest");
		
	}
	
	@Test
	public void atest() {
		
		System.out.println("this is maintest");
		
		Assert.assertEquals("abc", "abc");
		
		
		
	}
	
	@Test
	public void btest() {
		
		System.out.println("this is maintest");
		
		
		//Assert.assertEquals(false, true);
		
		//Assert.assertTrue(false);
		
		Assert.assertFalse(false);
		
		
		
	}
	
	
	

}
