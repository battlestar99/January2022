package nationWide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nationWideRun {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://multiproduct.nationwide.com/multi-quote/getting-started");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement firstName = driver.findElement(By.id("gs-first-name"));
		WebElement lastName = driver.findElement(By.id("gs-last-name"));
		//WebElement autoSelection = driver.findElement(By.xpath("/html/body/mq-root/mq-multi-quote/mq-getting-started/mq-getting-started-form/form/div/div[5]/mq-products-list/div/div/div/div/div/div[1]/div[2]/span/mq-product/label/div[2]/div"));
		
		WebElement stateDD = driver.findElement(By.id("gs-quote-state"));
		
		boolean x = firstName.isDisplayed(); 
		System.out.println(x);
		
		firstName.sendKeys("michael");
		lastName.sendKeys("john");
		
		Select dd = new Select(stateDD);
		
		dd.selectByVisibleText("VA");
		
	

	}

}
