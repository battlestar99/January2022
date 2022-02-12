package sauceDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class loginValidation {
	
	
	WebDriver driver; 
	
	
	
	// pre requirment of the test
	@BeforeTest
	public void testSetup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
		
	}
	
	@Test(priority=0)
	public void displayloginElements() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));
		
		boolean actualusernamedisplay = username.isDisplayed();
		boolean actualuserpassworddisplay = password.isDisplayed();
		boolean actualuserlogindisplay = login.isDisplayed();
		
		Assert.assertTrue(actualusernamedisplay);
		Assert.assertTrue(actualuserpassworddisplay);
		Assert.assertTrue(actualuserlogindisplay);
		
		
	}
	
	@Test(priority=1)
	public void enableLoginElements() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));
		
		
		boolean actualusernameenable = username.isEnabled();
		boolean actualuserpasswordenable = password.isEnabled();
		boolean actualuserloginenable = login.isEnabled();
		
		Assert.assertTrue(actualusernameenable);
		Assert.assertTrue(actualuserpasswordenable);
		Assert.assertTrue(actualusernameenable);
		
		
	}
	
	
	
	

}
