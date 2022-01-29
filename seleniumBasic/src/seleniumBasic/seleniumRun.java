package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumRun {

	public static void main(String[] args) {
		
		// setting up properties for chrome and providing location of the driver file
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		
		
		// creating object of the webdriver class to use the functions from that class
		
		// open the chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1= new ChromeDriver();
		
		WebDriver driver2= new ChromeDriver();
		
		// navigating to any url or website 
		
		driver.get("https://www.saucedemo.com/");
		
		driver2.get("https://www.google.com/");
		
		// another function to navigate 
		
		driver1.navigate().to("https://login.yahoo.com/account/create");
		
		
		

	}

}
