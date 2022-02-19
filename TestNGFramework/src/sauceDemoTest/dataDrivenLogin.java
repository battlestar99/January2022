package sauceDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.loginPage;

public class dataDrivenLogin extends baseTest {
	
	
	//WebDriver driver; 
	loginPage lp;
	
	
	
	@BeforeTest
	public void testSetup() throws InterruptedException {
		
		setup();
		
		lp = new loginPage(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		
		
		
		
		
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.quit();
		
	}

	@Parameters({"username","password","expectedUrl"})
	@Test
	public void LoginTest(String username, String password, String expectedUrl) {
		
		
		lp.getUserName().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getloginButton().click();
		
		String actualUrl = driver.getCurrentUrl();
		
		Reporter.log("validating login with different sets of data");
	
		Assert.assertEquals(actualUrl,expectedUrl);
	
		
	}
	

}
