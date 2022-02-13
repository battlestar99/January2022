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

public class dataDrivenLogin {
	
	
	WebDriver driver; 
	loginPage lp;
	
	
	
	@BeforeTest
	public void testSetup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		lp = new loginPage(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().window().maximize();
		
		
		
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
