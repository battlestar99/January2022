package webElementInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementInteractionSwagLab {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		// finding the web element and type value 
		
		// entering user name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		Thread.sleep(2000);
		// entering password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		// click login 
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
