package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserInteractiontwo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		
		// to delete cookies 
		
		driver.manage().deleteAllCookies();
		
		// maximize the window 
		
		driver.manage().window().maximize();
		
		// closing the browser 
		
		//driver.quit();
		
		driver.close();
		
		
		

	}

}
