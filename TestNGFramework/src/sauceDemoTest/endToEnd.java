package sauceDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.cart;
import pages.checkOutStepTwo;
import pages.checkoutStepOne;
import pages.loginPage;
import pages.productPage;

public class endToEnd {
	
	WebDriver driver; 
	loginPage lp;
	productPage pp;
	cart cr;
	checkoutStepOne co;
	checkOutStepTwo cot;
	
	
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		 lp = new loginPage(driver);
		 pp = new productPage(driver);
		 cr = new cart(driver);
		 co = new checkoutStepOne(driver);
		 cot = new checkOutStepTwo(driver);
		
		
	      driver.get("https://www.saucedemo.com/");
		
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
	
	
	@Test(priority=0)
	public void loginTest() {
		
		lp.getUserName().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualUrl = driver.getCurrentUrl();
		
		Reporter.log("Validating login with valid credential");
	
		Assert.assertEquals(actualUrl,expectedUrl);
	
		
	}
	
	
	@Test(priority=1)
	
	public void addProduct() {
		
		pp.addBackpacktoCart().click();
		pp.addBikeLighttoCart().click();
		pp.clickCart().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		String expectedText = "REMOVE";
		String actualText = cr.getRemoveProductOne().getText();
		
		Reporter.log("validating if user can add product to the cart");
		
		Assert.assertEquals(actualText,expectedText);
		
	}
	
	
@Test(priority=2)
	
	public void checkoutProcess() throws InterruptedException {
	
	Thread.sleep(2000);
	cr.getCheckOutbutton().click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	co.getfirstName().sendKeys("Michael");
	co.getlastName().sendKeys("John");
	co.getzipcode().sendKeys("34567");
	co.getContButton().click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	cot.getFinish().click();
	
	String expectedCheckoutComplete = "https://www.saucedemo.com/checkout-complete.html";
	String actualCheckoutCopmplet = driver.getCurrentUrl();
	
	Reporter.log("validating checkout is successful with a product");
	
	Assert.assertEquals(actualCheckoutCopmplet,expectedCheckoutComplete);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
