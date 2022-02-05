package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumRunTwo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		
		driver.manage().deleteAllCookies();
		
		// using implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement ccode = driver.findElement(By.name("shortCountryCode"));
		
		Select country = new Select(ccode);
		
	//	country.selectByVisibleText("Denmark(+45)‬‬‬‬");
		
		//country.selectByIndex(12);
		
		country.selectByValue("DK");
		
		
		WebElement bmdd = driver.findElement(By.id("usernamereg-month"));
		
		Select birthMonth = new Select(bmdd);
		
		birthMonth.selectByVisibleText("June");
		
		WebElement contButton = driver.findElement(By.name("signup"));
		
		String buttonText = contButton.getText();
		
		System.out.println(buttonText);
		
		
		
		
		
		

	}

}
