package webElementInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementsAttribute {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		
		int x = 12; 
		
		// firstname webelement
		WebElement firstname = driver.findElement(By.id("usernamereg-firstName"));
		WebElement lastname = driver.findElement(By.id("usernamereg-lastName"));
		WebElement loginButton = driver.findElement(By.name("signup"));
		
		
		
		 boolean firstNamedisplay = firstname.isDisplayed();
		 boolean firstrnameEnable = firstname.isEnabled();
		 
		 String loginbuttonText = loginButton.getText();
		 
		 System.out.println(firstNamedisplay);
		 System.out.println(firstrnameEnable);
		 System.out.println(loginbuttonText);
		 
		 
		 
		
	
		
		
		
		

	}

}
