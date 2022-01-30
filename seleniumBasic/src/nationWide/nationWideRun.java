package nationWide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nationWideRun {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://multiproduct.nationwide.com/multi-quote/getting-started");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement firstName = driver.findElement(By.id("gs-first-name"));
		
		
		boolean x = firstName.isDisplayed(); 
		System.out.println(x);
		
		firstName.sendKeys("michael");

	}

}
