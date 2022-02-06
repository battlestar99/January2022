package sauceDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginPage;

public class lockedOutUser {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		loginPage lp = new loginPage(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		lp.getUserName().sendKeys("locked_out_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		
		
		
		

	}

}
