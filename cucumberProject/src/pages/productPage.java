package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
	
	
WebDriver driver;
	
	
	public productPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
public WebElement addBackpacktoCart() {
		
		WebElement x = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		
		return x; 
		
	}
	
public WebElement clickCart() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	
	return x; 
	
}

public WebElement addBikeLighttoCart() {
	
	WebElement x = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
	
	return x; 
	
}


public WebElement removeBackpacktoCart() {
	
	WebElement x = driver.findElement(By.id("remove-sauce-labs-backpack"));
	
	return x; 
	
}
	
	
	

}
