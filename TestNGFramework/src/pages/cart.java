package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cart {
	
	
WebDriver driver;
	
	
	public cart(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getCheckOutbutton() {
		
		WebElement x = driver.findElement(By.id("checkout"));
		return x; 
		
		
	}
	
	
	public WebElement getRemoveProductOne() {
		
		WebElement x = driver.findElement(By.id("remove-sauce-labs-backpack"));
		return x; 
		
		
	}
	
	
	
	

}
