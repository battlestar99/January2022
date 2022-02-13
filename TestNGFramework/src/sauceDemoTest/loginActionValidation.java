package sauceDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.loginPage;

public class loginActionValidation {
	
	WebDriver driver; 
	loginPage lp;
	int x; 
	
	
	@BeforeTest
	public void testSetup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		lp = new loginPage(driver);
		
		x = 12; 
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
	@BeforeMethod
	public void testUrlnavigation() {
		
		driver.get("https://www.saucedemo.com/");
		
		
	}
	
	
	@Test(priority=0)
	public void positiveLogin() {
		
		
		lp.getUserName().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualUrl = driver.getCurrentUrl();
		
		Reporter.log("validating login with positive credentials");
	
		Assert.assertEquals(actualUrl,expectedUrl);
	
		
	}
	
	
	@Test(priority=1) 
	
	public void negativeLogin() {
		
		lp.getUserName().sendKeys("locked_out_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		String expectedUrl = "https://www.saucedemo.co/";
	    String actualUrl = driver.getCurrentUrl();
		
		Reporter.log("validating login with negative credentials");
	    
	    Assert.assertEquals(actualUrl,expectedUrl);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
