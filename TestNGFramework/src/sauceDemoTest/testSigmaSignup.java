package sauceDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.sigmaSignUpPage;

public class testSigmaSignup {
	
	WebDriver driver; 
	sigmaSignUpPage ssup; 
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		ssup = new sigmaSignUpPage(driver);
		
		driver.get("https://travel.testsigma.com/signup");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		
	}	
	
	
	@AfterTest
	
	public void endTest() {
		
		driver.quit();
		
		
	}
	
	
	@Test
	
	public void validateElement() {
		
		boolean fullNameEnable = ssup.getFullName().isEnabled();
		boolean emailEnable = ssup.getEmail().isEnabled();
		
		
		Reporter.log("validating if the full name and email is enabled");
		
		Assert.assertTrue(fullNameEnable);
		
		Assert.assertTrue(emailEnable);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
