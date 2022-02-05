package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testingWeb {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		
		driver.manage().deleteAllCookies();
		
		// using implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Thread.sleep(10000);
		
		
		WebElement helpLink = driver.findElement(By.linkText("Help"));
		
		helpLink.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
      WebElement searchBox = driver.findElement(By.id("searchInput"));
		
      searchBox.sendKeys("yahoo news");
      
     // WebElement searchButton = driver.findElement(By.id("search-submit"));
      
      // explicit wait
     
      WebDriverWait wait = new WebDriverWait(driver, 3);
		
      
     WebElement searchButton = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.id("search-submit")));
      
		
     // searchButton.click();
      
	}

}
