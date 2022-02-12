package sauceDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.cart;
import pages.checkOutStepTwo;
import pages.checkoutStepOne;
import pages.loginPage;
import pages.productPage;

public class endToEnd {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		loginPage lp = new loginPage(driver);
		productPage pp = new productPage(driver);
		cart cr = new cart(driver);
		checkoutStepOne co = new checkoutStepOne(driver);
		checkOutStepTwo cot = new checkOutStepTwo(driver);
		
		
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		lp.getUserName().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		pp.addBackpacktoCart().click();
		pp.addBikeLighttoCart().click();
		pp.clickCart().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		cr.getCheckOutbutton().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		co.getfirstName().sendKeys("Michael");
		co.getlastName().sendKeys("John");
		co.getzipcode().sendKeys("34567");
		co.getContButton().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		cot.getFinish().click();
		
		
		driver.quit();
		
		

	}

}
