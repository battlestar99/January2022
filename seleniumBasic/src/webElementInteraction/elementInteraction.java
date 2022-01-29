package webElementInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		// finding the web element and type value 
		
		driver.findElement(By.name("firstName")).sendKeys("John");
		
		
		driver.findElement(By.name("lastName")).sendKeys("Travolta");
		
		
		
		
		

	}

}
