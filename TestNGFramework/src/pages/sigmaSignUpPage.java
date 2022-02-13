package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sigmaSignUpPage {
	
	
	WebDriver driver; 
	
	public sigmaSignUpPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
	public WebElement getFullName() {
		
		WebElement name = driver.findElement(By.id("name"));
		return name; 
		
	}
	
	public WebElement getEmail() {
		
		WebElement email = driver.findElement(By.id("emailid"));
		return email; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
