package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserInteraction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		
		// reading the value of current url 
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		// reading the title of the page 
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
	    // to click on the help link of the yahoo page 
		
		driver.findElement(By.linkText("Help")).click();
		
		url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		title = driver.getTitle();
		
		System.out.println(title);
		
		
		// to close the browser 
		
		//driver.quit();
		
		
		
		

	}

}
