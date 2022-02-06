package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkOutStepTwo {

	
	
	WebDriver driver;
	
	
	public checkOutStepTwo(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	public WebElement getFinish() {
		
		WebElement x = driver.findElement(By.id("finish"));
		
		 return x;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
