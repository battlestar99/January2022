package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloSelenium {

	public static void main(String[] args) {
		
	    
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		System.out.println("this is first selenium class");	
		
		

	}

}
