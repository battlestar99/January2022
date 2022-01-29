package webElementInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumRun {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle(); 
		
		System.out.println(url);
		System.out.println(title);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
		System.out.println("URL value after clicking the login button");
		url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		// closing the browser
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
