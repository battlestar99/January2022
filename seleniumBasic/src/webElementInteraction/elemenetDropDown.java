package webElementInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class elemenetDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		
		
		Thread.sleep(2000);
		
		WebElement monthdd = driver.findElement(By.id("usernamereg-month"));
		
		Select mdd = new Select(monthdd);
		
		//mdd.selectByVisibleText("May");
		
		//mdd.selectByValue("5");
		
		mdd.selectByIndex(5);
		
		
		
		

	}

}
